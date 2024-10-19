package com.example.ReviewingService.repository;

import com.example.ReviewingService.domain.ReviewRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRecordRepository extends JpaRepository<ReviewRecord, Integer> {
    // Define custom query methods if needed
}
