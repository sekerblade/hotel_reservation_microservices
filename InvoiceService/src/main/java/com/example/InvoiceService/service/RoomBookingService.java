package com.example.InvoiceService.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.InvoiceService.repository.RoomBookingRepository;
import com.example.InvoiceService.domain.RoomBooking;

import java.util.List;

@Service
public class RoomBookingService {

    private final RoomBookingRepository roomBookingRepository;

    @Autowired
    public RoomBookingService(RoomBookingRepository roomBookingRepository) {
        this.roomBookingRepository = roomBookingRepository;
    }

    public RoomBooking getRoomBookingById(Integer id) {
        return roomBookingRepository.findById(id).orElse(null);
    }

    // Additional methods to handle other business logic
}
