package test.userstore.shared.dto;

import lombok.Data;
import test.userstore.entity.CustomerTransaction;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

public @Data
class CustomerDto implements Serializable {
    private long id;

    private String customerName;

    private String customerAddress;

    private Long phoneNumber;

    private LocalDateTime joinedDate;

    private Set<CustomerTransaction> transactionList;

    private String rewardPoint;
}
