package com.example.authenticationDemo.authDemo.service;

import com.example.authenticationDemo.authDemo.domain.Customer;
import com.example.authenticationDemo.authDemo.exception.CustomerNotFoundException;
import com.example.authenticationDemo.authDemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    public Customer addUser(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findByCustomerNameAndPassword(String customerName, String password) throws CustomerNotFoundException {
        Customer customer = customerRepository.findByCustomerNameAndPassword(customerName,password);
        if(customer ==null){
            throw new CustomerNotFoundException();
        }

        return customer;
    }

    @Override
    public List<Customer> getAllUser() {
        return customerRepository.findAll();
    }

    @Override
    public boolean deleteCustomer(int customerId) throws CustomerNotFoundException {
        boolean result = false;

        if (customerRepository.findById(customerId).isEmpty()) {
            throw new CustomerNotFoundException();
        } else {
            customerRepository.deleteById(customerId);
            result = true;
        }
        return result;
    }
}
