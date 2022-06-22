package test.userstore.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import test.userstore.entity.Customer;
import test.userstore.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
    	System.out.println("Customer addtion controller heated");
    	System.out.print(customer.toString());
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/rewards/id")
    public String getCustomerMonthlyReward(@PathVariable("id") Long id) {

        return "";
    }
}
