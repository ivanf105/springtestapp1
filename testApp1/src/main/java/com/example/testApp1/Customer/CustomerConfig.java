package com.example.testApp1.Customer;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CustomerConfig {
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository repository){
        return args -> {
            Customer ivan= new Customer(1L,"ivan@gmail.com","7084565976");
            repository.saveAll(List.of(ivan));
        };

    }
}
