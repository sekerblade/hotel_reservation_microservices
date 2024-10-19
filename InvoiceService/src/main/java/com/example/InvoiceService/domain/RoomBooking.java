package com.example.InvoiceService.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_room_bookings")
public class RoomBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "room_id")
    private Integer roomId;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    // Default constructor
    public RoomBooking() {
    }

    // Parametrized constructor
    public RoomBooking(Integer roomId, LocalDate startDate, LocalDate endDate) {
        this.roomId = roomId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and setters for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getters and setters for roomId
    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    // Getters and setters for startDate
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    // Getters and setters for endDate
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
