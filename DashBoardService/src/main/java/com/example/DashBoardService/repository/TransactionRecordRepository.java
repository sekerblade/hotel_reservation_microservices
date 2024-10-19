package com.example.DashBoardService.repository;

import com.example.DashBoardService.domain.TransactionRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionRecordRepository extends JpaRepository<TransactionRecord, Long> {

    List<TransactionRecord> findAllByDateBetween(LocalDate startDate, LocalDate endDate);

}
