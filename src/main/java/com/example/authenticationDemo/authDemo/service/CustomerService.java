package com.example.authenticationDemo.authDemo.service;

import com.example.authenticationDemo.authDemo.domain.Customer;
import com.example.authenticationDemo.authDemo.exception.CustomerNotFoundException;

import java.util.List;

public interface CustomerService {
    public Customer addUser(Customer customer);
    public Customer findByCustomerNameAndPassword(String customerName, String password) throws CustomerNotFoundException;
    List<Customer> getAllUser();
    boolean deleteCustomer(int customerId) throws CustomerNotFoundException;
}
