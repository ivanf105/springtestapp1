package com.example.testApp1.Customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {//Long in parameter to get id from customer table

    Optional<Customer> findByEmail(String email);//SELECT * FROM CUSTOMER WHERE email = "email";

}
