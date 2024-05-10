package org.aymendev.bankaccountservice1.repositories;

import org.aymendev.bankaccountservice1.entities.BankAccount;
import org.aymendev.bankaccountservice1.enums.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    @RestResource(path= "/byType")
    List<BankAccount> findByType(AccountType type);
}
