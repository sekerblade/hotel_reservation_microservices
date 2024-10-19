package com.example.RoomManagementService.kafka.producer;

public class BookingMessage {
    private String start;
    private String end;
    private String roomId;

    public BookingMessage(String start, String end, String roomId) {
        this.start = start;
        this.end = end;
        this.roomId = roomId;
    }

    // Getters and setters for start, end, and roomId
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }
}
