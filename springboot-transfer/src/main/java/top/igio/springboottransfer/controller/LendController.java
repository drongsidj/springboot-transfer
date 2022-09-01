package top.igio.springboottransfer.controller;

import cn.hutool.core.date.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import top.igio.springboottransfer.entity.Account;
import top.igio.springboottransfer.entity.Record;
import top.igio.springboottransfer.mapper.AccountMapper;
import top.igio.springboottransfer.mapper.RecordMapper;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/transfer")
public class LendController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private RecordMapper recordMapper;
    @Autowired
    private AccountMapper accountMapper;

    @PostMapping("/lend")
    public String insertRecord(@RequestBody Record record) {
        // 获取贷方账号ID和转账金额
        Long lendId = record.getLendId();
        BigDecimal transferAmount = record.getTransferAmount();
        Account account = accountMapper.getByAccountId(lendId);

        recordMapper.insertAll(record);
        System.out.println(record.getAppointmentTime());
        //如果余额大于转账金额，进行转账
        if(account.getBalance().compareTo(transferAmount) == 1 && record.getTransferType() == 1){
            // 更新账号余额
            account.setBalance(account.getBalance().subtract(transferAmount));
            accountMapper.updateAccountId(account);

            //发送请求，更新借方账号余额
            restTemplate.postForEntity("http://localhost:8082/transfer/borrow",record,String.class);

            //判断转账记录是否写入成功
            if(recordMapper.selectById(record.getRecordId())!=null) {
                record.setSucceed("Y");
                recordMapper.updateTransferState(record);
                return "success";
            } else {
                return "false";
            }
        } else {
            return "Insufficient balance!";
        }
    }
}
