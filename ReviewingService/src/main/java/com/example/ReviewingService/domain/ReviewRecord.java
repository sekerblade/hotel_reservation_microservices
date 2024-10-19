package com.example.ReviewingService.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_review_records")
public class ReviewRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "review_text")
    private String reviewText;

    // Default constructor
    public ReviewRecord() {
    }

    // Parameterized constructor
    public ReviewRecord(String reviewText) {
        this.reviewText = reviewText;
    }

    // Getter for id
    public Integer getId() {
        return id;
    }

    // Setter for id
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter for reviewText
    public String getReviewText() {
        return reviewText;
    }

    // Setter for reviewText
    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
}
