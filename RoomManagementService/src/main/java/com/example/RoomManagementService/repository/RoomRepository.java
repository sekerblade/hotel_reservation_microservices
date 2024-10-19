package com.example.RoomManagementService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.RoomManagementService.domain.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {
    // This method uses JPQL to find all rooms that are not in the list of given IDs
    @Query("SELECT r FROM Room r WHERE r.id NOT IN :bookedRoomIds")
    List<Room> findAllByIdNotIn(List<Integer> bookedRoomIds);
}
