package org.aymendev.bankaccountservice1.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aymendev.bankaccountservice1.enums.AccountType;

import java.util.Date;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class BankAccountResponseDTO {
    private String id;
    private Date createdAt;
    private double balance;
    private String currency;
    private AccountType type;
}
