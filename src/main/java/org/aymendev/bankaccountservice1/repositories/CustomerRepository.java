package org.aymendev.bankaccountservice1.repositories;

import org.aymendev.bankaccountservice1.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
