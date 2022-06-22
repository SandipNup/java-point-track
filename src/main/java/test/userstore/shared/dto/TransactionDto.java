package test.userstore.shared.dto;

import lombok.Data;
import test.userstore.entity.Customer;

import java.io.Serializable;
import java.time.LocalDateTime;

public @Data
class TransactionDto implements Serializable {
    private long id;

    private Customer customer;

    private Long amount;

    private LocalDateTime transactionDate;
}
