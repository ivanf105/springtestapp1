package com.example.testApp1.Payment;

import com.example.testApp1.Customer.CustomerRepository;
import com.example.testApp1.Orders.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment>  getPayment(){
        return paymentRepository.findAll();
    }

    public void addNewPayment(Payment payment) {
        paymentRepository.save(payment);

    }

    public void deletePayment(Long id) {
        if(paymentRepository.existsById(id)){
            paymentRepository.deleteById(id);
        }
    }
    @Transactional
    public void updatePayment(Long id,String cardNumber){
        Payment payment = paymentRepository.findById(id).orElseThrow(()-> new IllegalStateException("id"));//have to put orElseThrow to work
        if(paymentRepository.existsById(id)){
            System.out.println(cardNumber);
            payment.setCardNumber(cardNumber);

        }
    }
}
