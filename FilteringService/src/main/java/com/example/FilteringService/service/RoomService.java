package com.example.FilteringService.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.FilteringService.repository.RoomBookingRepository;
import com.example.FilteringService.repository.RoomRepository;
import com.example.FilteringService.domain.Room;
import com.example.FilteringService.domain.RoomBooking;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Autowired
    private RoomBookingRepository roomBookingRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room getRoomById(Integer id) {
        return roomRepository.findById(id).orElse(null);
    }

    public Room addRoom(Room room) {
        return roomRepository.save(room); // Saves the room to the database
    }

    public RoomService(RoomRepository roomRepository, RoomBookingRepository roomBookingRepository) {
        this.roomRepository = roomRepository;
        this.roomBookingRepository = roomBookingRepository;
    }

    public List<Room> getAvailableRoomsFiltered(LocalDate start, LocalDate end, Integer minPrice, Integer maxPrice,
            Integer minQuantity) {
        List<Room> roomsByDate = roomBookingRepository.findAvailableRoomsByDate(start, end);
        return roomsByDate.stream()
                .filter(room -> (minPrice == null || room.getPrice() >= minPrice) &&
                        (maxPrice == null || room.getPrice() <= maxPrice) &&
                        (minQuantity == null || room.getQuantity() >= minQuantity))
                .collect(Collectors.toList());
    }

    // Additional methods to handle other business logic
}
