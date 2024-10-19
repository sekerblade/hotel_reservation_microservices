package com.example.BookingService.controller;

// BookingController.java

import com.example.BookingService.domain.RoomBooking;
import com.example.BookingService.service.RoomBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bookings")
public class RoomBookingController {

    @Autowired
    private RoomBookingService roomBookingService;

    @PostMapping("/add")
    public RoomBooking addBooking(@RequestBody RoomBooking booking) {
        return roomBookingService.addBooking(booking);
    }
}
