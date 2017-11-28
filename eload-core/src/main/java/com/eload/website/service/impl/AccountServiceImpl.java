package com.eload.website.service.impl;

import com.eload.dao.AccountMapper;
import com.eload.pojo.Account;
import com.eload.website.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account getAccount(long l) {
        Account account = accountMapper.selectByPrimaryKey(l);
        return account;
    }
}
