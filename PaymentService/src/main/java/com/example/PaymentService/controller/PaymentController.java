package com.example.PaymentService.controller;

import com.example.PaymentService.domain.TransactionRecord;
import com.example.PaymentService.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/insert")
    public String insertTransactionRecord(
            @RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date,
            @RequestParam("total_bath") BigDecimal totalThaiBath) {
        paymentService.insertTransactionRecord(date, totalThaiBath);
        return "Transaction record inserted successfully";
    }

}
