package com.example.authenticationDemo.authDemo.repository;

import com.example.authenticationDemo.authDemo.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>
{
public Customer findByCustomerNameAndPassword(String customerName, String password);
}
