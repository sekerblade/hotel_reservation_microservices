package com.example.BookingService.kafka.consumer;

import com.example.BookingService.domain.RoomBooking;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class MessageConsumer {

    @Autowired
    private AddBookingService addBookingService;

    @KafkaListener(topics = "quickstart-events", groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
        // Deserialize JSON message into RoomBooking object
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule()); // Register JavaTimeModule
        try {
            RoomBooking booking = objectMapper.readValue(message, RoomBooking.class);
            // Invoke service to add booking to database
            addBookingService.addBooking(booking);
        } catch (IOException e) {
            System.err.println("Error deserializing message: " + e.getMessage());
        }
    }
}
