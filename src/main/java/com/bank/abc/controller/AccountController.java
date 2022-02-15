package com.bank.abc.controller;

import com.bank.abc.enitity.AccountEntity;
import com.bank.abc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/accounts")
    public AccountEntity createAccount(@RequestBody AccountEntity accountEntity) {
        return accountService.createAccount(accountEntity);
    }

    @GetMapping("/accounts/{id}")
    public AccountEntity findAccountById(@PathVariable int id) {
        return accountService.findAccountById(id);
    }

    @GetMapping("/accounts")
    public List<AccountEntity> findAllAccounts() {
        return accountService.findAllAccounts();
    }
}
