package com.example.BookingService.service;

// RoomBookingService.java

import com.example.BookingService.domain.RoomBooking;
import com.example.BookingService.repository.RoomBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoomBookingService {

    @Autowired
    private RoomBookingRepository roomBookingRepository;

    @Transactional
    public RoomBooking addBooking(RoomBooking booking) {
        return roomBookingRepository.save(booking);
    }
}
