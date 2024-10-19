package com.example.ReviewingService.service;

import com.example.ReviewingService.domain.ReviewRecord;

import java.util.List;

public interface ReviewingService {

    void insertReviewRecord(String reviewText);

    List<ReviewRecord> getAllReviewRecords();
}
