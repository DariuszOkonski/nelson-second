package com.example.nelsonsecond.customer;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "aaa"),
                new Customer(2L, "Jamila Ahmed", "bbb")
        );
    }
}
