package test.userstore.service;

import test.userstore.entity.CustomerTransaction;

import java.util.List;

public interface TransactionService {
    List<CustomerTransaction> findAllCustomerTransaction();

    CustomerTransaction saveCustomerTransaction(CustomerTransaction transaction);
}
