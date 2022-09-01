package top.igio.springbootBorrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.igio.springbootBorrow.entity.Account;
import top.igio.springbootBorrow.entity.Record;
import top.igio.springbootBorrow.mapper.AccountMapper;

import java.math.BigDecimal;

@RestController
@RequestMapping("/transfer")
public class BorrowController {
    @Autowired
    private AccountMapper accountMapper;

    @PostMapping("/borrow")
    public int updateBalance(@RequestBody Record record){
        Long borrowId = record.getBorrowId();
        BigDecimal transferAmount = record.getTransferAmount();

        // 更新账号余额
        Account account = accountMapper.getByAccountId(borrowId);
        account.setBalance(account.getBalance().add(transferAmount));
        accountMapper.updateAccountId(account);

        return 1;
    }
}
