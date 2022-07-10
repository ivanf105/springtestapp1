package com.example.testApp1.Customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    public List<Customer> getCustomer(){
        List<Customer> list = new ArrayList<Customer>();

        list.add(new Customer(
                1L,
                "ivan@gmail.com",
                "7089111234"));
        list.add(new Customer(
                1L,
                "joe@gmail.com",
                "773131234"));

        return list;
    }
}
