package org.aymendev.bankaccountservice1.service;

import org.aymendev.bankaccountservice1.dto.BankAccountRequestDTO;
import org.aymendev.bankaccountservice1.dto.BankAccountResponseDTO;
import org.aymendev.bankaccountservice1.entities.BankAccount;
import org.aymendev.bankaccountservice1.mappers.AccountMapper;
import org.aymendev.bankaccountservice1.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount=BankAccount.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(new Date())
                .balance(bankAccountDTO.getBalance())
                .type(bankAccountDTO.getType())
                .currency(bankAccountDTO.getCurrency())
                .build();
        BankAccount saveBankAccount = bankAccountRepository.save(bankAccount);
        BankAccountResponseDTO bankAccountResponseDTO = accountMapper.fromBankAccount(saveBankAccount);

        return bankAccountResponseDTO;
    }
}
