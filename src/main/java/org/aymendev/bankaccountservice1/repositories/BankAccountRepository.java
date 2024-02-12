package org.aymendev.bankaccountservice1.repositories;

import org.aymendev.bankaccountservice1.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
