package top.igio.springboottransfer.controller;


import cn.hutool.core.date.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;
import top.igio.springboottransfer.entity.Account;
import top.igio.springboottransfer.entity.Record;
import top.igio.springboottransfer.mapper.AccountMapper;
import top.igio.springboottransfer.mapper.RecordMapper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Component
public class TransferJob {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RecordMapper recordMapper;
    @Autowired
    private AccountMapper accountMapper;


    @Scheduled(cron = "0/1 * * * * ?")
    public void transfer() {
        //System.out.println("定时任务开启，当前时间：" + DateUtil.date());
        //获取当前时间
        Date date = DateUtil.date();
        String formatDateTime = DateUtil.formatDateTime(date);
        List<Record> records = recordMapper.selectByTime(formatDateTime);

        if (records.size() != 0) {
            for (Record record : records) {
                // 获取贷方账号ID和转账金额
                Long lendId = record.getLendId();
                BigDecimal transferAmount = record.getTransferAmount();
                Account account = accountMapper.getByAccountId(lendId);

                // 如果余额大于转账金额，进行转账
                if (account.getBalance().compareTo(transferAmount) == 1) {
                    // 更新账号余额
                    account.setBalance(account.getBalance().subtract(transferAmount));
                    accountMapper.updateAccountId(account);

                    // 发送请求，更新借方账号余额
                    restTemplate.postForEntity("http://localhost:8082/transfer/borrow", record, String.class);

                    // 更新交易记录状态
                    record.setSucceed("Y");
                    recordMapper.updateTransferState(record);
                }
            }
        }
    }
}
