package com.example.RoomManagementService.controller;

import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;

import com.example.RoomManagementService.domain.Room;
import com.example.RoomManagementService.domain.RoomBooking;
import com.example.RoomManagementService.service.RoomService;

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

    @GetMapping("/")
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable Integer id) {
        return roomService.getRoomById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<Room> addRoom(@RequestBody Room room) {
        System.out.println("Received room: " + room);
        Room newRoom = roomService.addRoom(room);
        return ResponseEntity.ok(newRoom);
    }

    // Additional endpoints as required
}
