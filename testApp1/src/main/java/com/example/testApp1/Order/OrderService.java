package com.example.testApp1.Order;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    public List<Order> getOrders() {
        List <Order> list = new ArrayList<>();
        list.add(new Order(1L,12345L,"ivan@gmail.com","7088901234",13457L));
        return list;
    }
}
