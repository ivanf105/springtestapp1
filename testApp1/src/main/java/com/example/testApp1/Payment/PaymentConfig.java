package com.example.testApp1.Payment;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PaymentConfig {
    @Bean
    CommandLineRunner commandLineRunner2(PaymentRepository repository){
     return args -> {
      Payment card1 = new Payment(4546546L,"435354566");
      repository.saveAll(List.of(card1));
     };
    }
}
