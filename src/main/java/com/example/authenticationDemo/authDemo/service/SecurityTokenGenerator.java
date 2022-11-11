package com.example.authenticationDemo.authDemo.service;

import com.example.authenticationDemo.authDemo.domain.Customer;

import java.util.Map;

public interface SecurityTokenGenerator
{
    Map<String,String> generateToken(Customer customer);
}
