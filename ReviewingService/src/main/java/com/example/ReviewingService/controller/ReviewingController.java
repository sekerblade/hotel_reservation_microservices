package com.example.ReviewingService.controller;

import com.example.ReviewingService.domain.ReviewRecord;
import com.example.ReviewingService.service.ReviewingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewingController {

    @Autowired
    private ReviewingService reviewingService;

    @PostMapping("/insert")
    public String insertReviewRecord(@RequestParam("review_text") String reviewText) {
        reviewingService.insertReviewRecord(reviewText);
        return "Review record inserted successfully";
    }

    @GetMapping("/get-all")
    public List<ReviewRecord> getAllReviewRecords() {
        return reviewingService.getAllReviewRecords();
    }
}
