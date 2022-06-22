package test.userstore.ui.models.response;

import lombok.Data;
import test.userstore.entity.Customer;

import java.time.LocalDateTime;


public @Data
class TransactionResponse {

    private long id;

    private Customer customer;

    private Long amount;

    private LocalDateTime transactionDate;
}
