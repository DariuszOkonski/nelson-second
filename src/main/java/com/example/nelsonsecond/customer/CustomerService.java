package com.example.nelsonsecond.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public Customer getCustomer() {
        return new Customer(1L, "James Bond 00s7");
    }
}
