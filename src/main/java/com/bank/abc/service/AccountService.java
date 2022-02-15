package com.bank.abc.service;

import com.bank.abc.repository.AccountRepository;
import com.bank.abc.enitity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountEntity createAccount(AccountEntity accountEntity) {
        return accountRepository.save(accountEntity);
    }

    public AccountEntity findAccountById(int id) {
        return accountRepository.findById(id).orElse(null);
    }

    public List<AccountEntity> findAllAccounts() {
        return accountRepository.findAll();
    }

    public String deleteAccountById(int id) {
        accountRepository.deleteById(id);
        return "account with id: " + id + "has been deleted";
    }
}
