package top.igio.springbootBorrow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.igio.springbootBorrow.entity.Account;
import top.igio.springbootBorrow.mapper.AccountMapper;
import top.igio.springbootBorrow.mapper.CustomerMapper;

import java.math.BigDecimal;
import java.util.HashMap;


/**
 * @author igio
 * @date 2022/8/17
 * @apiNote
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private CustomerMapper customerMapper;

    @GetMapping("/{accountId}")
    public Account getById(@PathVariable("accountId") long accountId){
        return accountMapper.getByAccountId(accountId);
    }

    @PostMapping("/add")
    public String insertAccount(@RequestBody Account account){
        if(customerMapper.findById(account.getCustomerId()) != null) {
            accountMapper.insertAll(account);
            return "success";
        } else {
            return "account no found!";
        }
    }

    @PutMapping("/delete/{accountId}")
    public String deleteById(@PathVariable("accountId") long accountId) {
        if(accountMapper.getByAccountId(accountId) != null) {
            accountMapper.delByAccountId(accountId);
            return "success";
        } else {
            return "account no found";
        }
    }

    @PutMapping
    public String updateById(@RequestBody Account account) {
        accountMapper.updateAccountId(account);
        return "ok";
    }

}

