package test.userstore.service;

import test.userstore.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomer();

    Customer saveCustomer(Customer customer);
    //Customer getCustomerById(Long id);

    //   @Query("SELECT c FROM Customer c WHERE c.id=c.id")
    //   getCustomerMonthlyReward()

}
