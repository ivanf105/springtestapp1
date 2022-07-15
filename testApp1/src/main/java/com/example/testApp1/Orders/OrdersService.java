package com.example.testApp1.Orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersService {
    private final OrderRepository orderRepository;
    @Autowired
    public OrdersService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Orders> getOrders() {
        List <Orders> list = new ArrayList<>();
        list.add(new Orders(1L,12345L,"ivan@gmail.com","7088901234",13457L));
        return list;
    }
}
