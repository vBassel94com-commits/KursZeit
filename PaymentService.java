package com.kurszeit.payment.service;

import com.kurszeit.payment.model.Payment;
import com.kurszeit.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment processPayment(Payment payment) {
        payment.setPaymentDate(new Date());
        return paymentRepository.save(payment);
    }

    public List<Payment> getUserPayments(Long userId) {
        return paymentRepository.findByUserId(userId);
    }
}
