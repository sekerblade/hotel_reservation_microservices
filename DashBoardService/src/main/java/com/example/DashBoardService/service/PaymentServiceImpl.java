package com.example.DashBoardService.service;

import com.example.DashBoardService.domain.TransactionRecord;
import com.example.DashBoardService.repository.TransactionRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private TransactionRecordRepository transactionRecordRepository;

    @Override
    public void insertTransactionRecord(LocalDate date, BigDecimal totalThaiBath) {
        TransactionRecord transactionRecord = new TransactionRecord();
        transactionRecord.setDate(date);
        transactionRecord.setTotalThaiBath(totalThaiBath);
        transactionRecordRepository.save(transactionRecord);
    }

    @Override
    public List<TransactionRecord> getAllTransactionRecordsInDateRange(LocalDate startDate, LocalDate endDate) {
        return transactionRecordRepository.findAllByDateBetween(startDate, endDate);
    }
}
