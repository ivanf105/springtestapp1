package com.example.testApp1.Customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @GetMapping
    @RequestMapping(path="api/v1/customer")
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
