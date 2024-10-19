package com.example.FilteringService.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "room_code")
    private String roomCode;

    @Column(name = "room_type")
    private String roomType; // e.g., Single, Double, Suite

    @Column(name = "available")
    private boolean available;

    private Integer price;
    private Integer quantity;

    // Constructors, getters and setters
    public Room() {
    }

    public Room(Integer id, String roomCode, String roomType, boolean isAvailable, Integer price, Integer quantity) {
        this.id = id;
        this.roomCode = roomCode;
        this.roomType = roomType;
        this.available = isAvailable;
        this.price = price;
        this.quantity = quantity;
    }

    // Standard getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String number) {
        this.roomCode = number;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String type) {
        this.roomType = type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
