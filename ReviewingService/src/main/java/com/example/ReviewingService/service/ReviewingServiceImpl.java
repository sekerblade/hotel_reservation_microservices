package com.example.ReviewingService.service;

import com.example.ReviewingService.domain.ReviewRecord;
import com.example.ReviewingService.repository.ReviewRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewingServiceImpl implements ReviewingService {

    @Autowired
    private ReviewRecordRepository reviewRecordRepository;

    @Override
    public void insertReviewRecord(String reviewText) {
        ReviewRecord reviewRecord = new ReviewRecord();
        reviewRecord.setReviewText(reviewText);
        reviewRecordRepository.save(reviewRecord);
    }

    @Override
    public List<ReviewRecord> getAllReviewRecords() {
        return reviewRecordRepository.findAll();
    }
}
