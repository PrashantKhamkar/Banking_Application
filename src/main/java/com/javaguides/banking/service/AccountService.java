package com.javaguides.banking.service;

import com.javaguides.banking.dto.AccountDto;
import com.javaguides.banking.entity.Account;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
