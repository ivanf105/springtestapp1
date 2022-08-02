package com.example.testApp1.Orders;

import com.example.testApp1.Customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
        //List <Orders> list = new ArrayList<>();
        //list.add(new Orders(1L,12345L,"ivan@gmail.com","7088901234",13457L));
        return orderRepository.findAll();
    }

    public void addNewOrder(Orders order) {
        System.out.println(order);
        orderRepository.save(order);
    }

    public void deleteOrder(Long id) {
        if(orderRepository.existsById(id)){
            orderRepository.deleteById(id);
        }
    }
    //If customer profile is deleted then the method with delete all orders associated to that account
    public void deleteAllCustomerOrder(Long profileId) {
        //created existsByProfileId in order Repository
        if(orderRepository.existsByProfileId(profileId)){
            orderRepository.deleteByAllOrdersByProfileId(profileId);
        }
    }
    @Transactional
    public void updateOrder(Long id,Long wic,String email){
        Orders order = orderRepository.findById(id).orElseThrow(()-> new IllegalStateException("id"));//have to put orElseThrow to work
        if(orderRepository.existsById(id)){
            order.setWic(wic);
            order.setProfileEmail(email);//If customer email is updated(not null) then that customers new email will be updated in existing order
        }
    }
}
