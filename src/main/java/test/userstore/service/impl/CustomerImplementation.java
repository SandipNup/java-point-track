package test.userstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.userstore.entity.Customer;
import test.userstore.repositories.CustomerRepository;
import test.userstore.service.CustomerService;

import java.util.List;

@Service
public class CustomerImplementation implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    public Customer getCustomerById(Long id) {
        return customerRepository.getById(id);
    }


}
