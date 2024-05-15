package org.aymendev.bankaccountservice1.service;

import org.aymendev.bankaccountservice1.dto.BankAccountRequestDTO;
import org.aymendev.bankaccountservice1.dto.BankAccountResponseDTO;
import org.aymendev.bankaccountservice1.entities.BankAccount;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountRequestDTO);
}
