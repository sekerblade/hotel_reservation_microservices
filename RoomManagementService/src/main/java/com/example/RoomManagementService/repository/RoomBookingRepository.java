package com.example.RoomManagementService.repository;

import com.example.RoomManagementService.domain.Room;
import com.example.RoomManagementService.domain.RoomBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;

public interface RoomBookingRepository extends JpaRepository<RoomBooking, Integer> {
    @Query("SELECT r FROM Room r WHERE r.available = true AND r.id NOT IN " +
            "(SELECT b.roomId FROM RoomBooking b WHERE b.startDate <= :end AND b.endDate >= :start)")
    List<Room> findAvailableRoomsByDate(LocalDate start, LocalDate end);

}
