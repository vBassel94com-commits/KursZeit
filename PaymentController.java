package com.kurszeit.payment.controller;

import com.kurszeit.payment.model.Payment;
import com.kurszeit.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/process")
    public Payment processPayment(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }

    @GetMapping("/user/{userId}")
    public List<Payment> getUserPayments(@PathVariable Long userId) {
        return paymentService.getUserPayments(userId);
    }
}
