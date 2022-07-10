package com.example.testApp1.Payment;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {
    public List<Payment>  getPayment(){
        List<Payment> list = new ArrayList<>();
        list.add(new Payment(1L,34445L,"42002340"));
        return list;
    }
}
