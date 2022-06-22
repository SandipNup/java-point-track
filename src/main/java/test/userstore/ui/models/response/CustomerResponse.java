package test.userstore.ui.models.response;

import lombok.Data;
import test.userstore.entity.CustomerTransaction;

import java.time.LocalDateTime;
import java.util.Set;

public @Data
class CustomerResponse {
    private long id;

    private String customerName;

    private String customerAddress;

    private Long phoneNumber;

    private LocalDateTime joinedDate;

    private Set<CustomerTransaction> transactionList;

    private String rewardPoint;
}
