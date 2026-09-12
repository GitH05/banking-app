package com.backend.banking_app.service;

import com.backend.banking_app.dto.AccountDto;

public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);
}
