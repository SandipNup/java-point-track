package test.userstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.userstore.entity.CustomerTransaction;
import test.userstore.repositories.CustomerTransactionRepository;
import test.userstore.service.TransactionService;

import java.util.List;

@Service
public class CustomerTransactionImplementation implements TransactionService {

    @Autowired
    CustomerTransactionRepository customerTransactionRepository;


    @Override
    public List<CustomerTransaction> findAllCustomerTransaction() {
        return customerTransactionRepository.findAll();
    }

    @Override
    public CustomerTransaction saveCustomerTransaction(CustomerTransaction transaction) {
        return customerTransactionRepository.save(transaction);
    }
}
