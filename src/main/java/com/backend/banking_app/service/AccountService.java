package com.backend.banking_app.service;

import com.backend.banking_app.dto.AccountDto;
import com.backend.banking_app.entity.Account;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
}
