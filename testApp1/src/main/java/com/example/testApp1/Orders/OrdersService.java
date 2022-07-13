package com.example.testApp1.Orders;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {
    public List<Orders> getOrders() {
        List <Orders> list = new ArrayList<>();
        list.add(new Orders(1L,12345L,"ivan@gmail.com","7088901234",13457L));
        return list;
    }
}
