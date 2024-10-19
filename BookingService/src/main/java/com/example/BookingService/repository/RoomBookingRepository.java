package com.example.BookingService.repository;

// RoomBookingRepository.java

import com.example.BookingService.domain.RoomBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomBookingRepository extends JpaRepository<RoomBooking, Integer> {
}
