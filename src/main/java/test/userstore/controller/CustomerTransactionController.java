package test.userstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.userstore.entity.CustomerTransaction;
import test.userstore.service.impl.CustomerTransactionImplementation;

import java.util.List;

@RestController
@RequestMapping("/customer-transactions")
public class CustomerTransactionController {
    @Autowired
    CustomerTransactionImplementation customerTransactionImplementation;

    @GetMapping
    public List<CustomerTransaction> getAllTransaction() {
        return customerTransactionImplementation.findAllCustomerTransaction();
    }

    @PostMapping
    public CustomerTransaction saveTransaction(@RequestBody CustomerTransaction transaction) {
        return customerTransactionImplementation.saveCustomerTransaction(transaction);
    }

}
