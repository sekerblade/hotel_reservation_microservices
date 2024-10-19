package com.example.RoomManagementService.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.RoomManagementService.repository.RoomBookingRepository;
import com.example.RoomManagementService.repository.RoomRepository;
import com.example.RoomManagementService.domain.Room;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getRoomById(Integer id) {
        return roomRepository.findById(id).orElse(null);
    }

    public Room addRoom(Room room) {
        return roomRepository.save(room); // Saves the room to the database
    }

    // Additional methods to handle other business logic
}
