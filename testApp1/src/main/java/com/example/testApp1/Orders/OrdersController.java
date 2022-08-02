package com.example.testApp1.Orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/orders")
public class OrdersController {
    private final OrdersService ordersService;

    @Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
    @GetMapping
    public List<Orders> getOrder(){
        return ordersService.getOrders();
    }

    @PostMapping
    public void addNewOrder(@RequestBody Orders order){
        ordersService.addNewOrder(order);
    }

    @DeleteMapping(path="{orderId}")
    public void deleteOrder(@PathVariable("orderId") Long id){
        ordersService.deleteOrder(id);
    }
    @PutMapping(path="{orderId}")
    public void updateOrder(@PathVariable("orderId") Long id,@RequestParam(required = false) Long wic){
        ordersService.updateOrder(id,wic,null);
    }
}
