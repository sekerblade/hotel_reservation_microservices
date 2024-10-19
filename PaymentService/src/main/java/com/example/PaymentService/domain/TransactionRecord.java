package com.example.PaymentService.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_transaction_records")
public class TransactionRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate date;

    @Column(name = "total_bath")
    private BigDecimal totalThaiBath;

    // Constructors
    public TransactionRecord() {
    }

    public TransactionRecord(LocalDate date, BigDecimal totalThaiBath) {
        this.date = date;
        this.totalThaiBath = totalThaiBath;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getTotalThaiBath() {
        return totalThaiBath;
    }

    public void setTotalThaiBath(BigDecimal totalThaiBath) {
        this.totalThaiBath = totalThaiBath;
    }
}
