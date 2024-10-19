package com.example.DashBoardService.controller;

import com.example.DashBoardService.domain.TransactionRecord;
import com.example.DashBoardService.service.PaymentService;
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

    @GetMapping("/total-money-by-date-range")
    public List<TransactionRecord> getTransactionRecordsInDateRange(
            @RequestParam("start_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam("end_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return paymentService.getAllTransactionRecordsInDateRange(startDate, endDate);
    }
}
