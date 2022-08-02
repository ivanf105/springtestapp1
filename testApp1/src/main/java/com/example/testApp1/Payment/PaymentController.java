package com.example.testApp1.Payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/payments")
public class PaymentController {
    private final PaymentService paymentService;
    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<Payment> getPayment(){
        return paymentService.getPayment();
    }

    @PostMapping
    public void addNewPayment(@RequestBody Payment payment){
        paymentService.addNewPayment(payment);
    }
    @DeleteMapping(path="{paymentId}")
    public void deletePayment(@PathVariable("paymentId") Long id){
        paymentService.deletePayment(id);
    }
    @PutMapping(path="{paymentId}")
    public void updatePayment(@PathVariable("paymentId")Long id,@RequestParam(required = false) String cardNumber){
        paymentService.updatePayment(id,cardNumber);
    }

}
