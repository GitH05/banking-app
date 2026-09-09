package com.backend.banking_app.service.Impl;

import org.springframework.stereotype.Service;

import com.backend.banking_app.dto.AccountDto;
import com.backend.banking_app.entity.Account;
import com.backend.banking_app.mapper.AccountMapper;
import com.backend.banking_app.repository.AccountRepository;
import com.backend.banking_app.service.AccountService;

@Service 
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;
    
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapAccountDtoToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapAccountToAccountDto(savedAccount);
    }
    
}
