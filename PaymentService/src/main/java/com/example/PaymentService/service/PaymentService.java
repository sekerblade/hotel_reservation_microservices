package com.example.PaymentService.service;

import com.example.PaymentService.domain.TransactionRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface PaymentService {

    void insertTransactionRecord(LocalDate date, BigDecimal totalThaiBath);

    List<TransactionRecord> getAllTransactionRecordsInDateRange(LocalDate startDate, LocalDate endDate);
}
