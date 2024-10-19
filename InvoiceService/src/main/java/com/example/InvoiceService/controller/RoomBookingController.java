package com.example.InvoiceService.controller;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;

import com.example.InvoiceService.domain.RoomBooking;
import com.example.InvoiceService.service.RoomBookingService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/room-bookings")
public class RoomBookingController {

    @Autowired
    private RoomBookingService roomBookingService;

    public RoomBookingController(RoomBookingService roomBookingService) {
        this.roomBookingService = roomBookingService;
    }

    @GetMapping("/{id}")
    public RoomBooking getRoomBookingById(@PathVariable Integer id) {
        return roomBookingService.getRoomBookingById(id);
    }

    // Additional endpoints as required
}
