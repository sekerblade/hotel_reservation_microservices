package com.example.InvoiceService.repository;

import com.example.InvoiceService.domain.RoomBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.time.LocalDate;
import java.util.List;

public interface RoomBookingRepository extends JpaRepository<RoomBooking, Integer> {

}
