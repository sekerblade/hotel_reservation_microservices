package com.example.BookingService.kafka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookingService.domain.RoomBooking;
import com.example.BookingService.repository.RoomBookingRepository;

import jakarta.transaction.Transactional;

@Service
public class AddBookingService {

    @Autowired
    private RoomBookingRepository roomBookingRepository; // Assuming you have a repository for RoomBooking

    @Transactional
    public void addBooking(RoomBooking booking) {
        // Insert booking into database
        roomBookingRepository.save(booking);
    }
}
