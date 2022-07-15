package com.example.testApp1.Orders;

import com.example.testApp1.Payment.Payment;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OrdersConfig {
    @Bean
    CommandLineRunner commandLineRunner3(OrderRepository repository) {
        return args -> {
            Orders order1 = new Orders();
            repository.saveAll(List.of(order1));
        };
    }
}
