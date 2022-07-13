package com.example.testApp1.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    @Autowired  //dependency injection for customerRepository
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository= customerRepository;
    }

    public List<Customer> getCustomer(){
        //returns list of db records
        return customerRepository.findAll();
    }
}
