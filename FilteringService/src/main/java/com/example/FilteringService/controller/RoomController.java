package com.example.FilteringService.controller;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;

import com.example.FilteringService.domain.Room;
import com.example.FilteringService.service.RoomService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/check-rooms-available")

    public ResponseEntity<List<Room>> checkAvailability(
            @RequestParam("start") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate start,
            @RequestParam("end") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate end,
            @RequestParam(value = "minPrice", required = false) Integer minPrice,
            @RequestParam(value = "maxPrice", required = false) Integer maxPrice,
            @RequestParam(value = "minQuantity", required = false) Integer minQuantity) {

        System.out.println("Received start date: " + start);
        System.out.println("Received end date: " + end);
        System.out.println("Price range: " + minPrice + " to " + maxPrice);
        System.out.println("Minimum quantity: " + minQuantity);

        List<Room> availableRooms = roomService.getAvailableRoomsFiltered(start, end, minPrice, maxPrice, minQuantity);
        if (availableRooms.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(availableRooms);
    }

    // Additional endpoints as required
}
