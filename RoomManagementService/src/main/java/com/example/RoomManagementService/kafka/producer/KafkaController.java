package com.example.RoomManagementService.kafka.producer;

import com.example.RoomManagementService.domain.RoomBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

@RestController
@RequestMapping("/api/kafka/rooms")
public class KafkaController {

    @Autowired
    private MessageProducer messageProducer;

    // @PostMapping("/send-booking")
    // public String sendBooking(
    // @RequestParam(value = "room_id") Integer roomId,
    // @RequestParam(value = "start_date", required = false) @DateTimeFormat(iso =
    // DateTimeFormat.ISO.DATE) LocalDate startDate,
    // @RequestParam(value = "end_date", required = false) @DateTimeFormat(iso =
    // DateTimeFormat.ISO.DATE) LocalDate endDate) {

    // RoomBooking booking = new RoomBooking(roomId, startDate, endDate);
    // messageProducer.sendMessage("booking-events", booking);
    // return "Booking sent for room ID " + booking.getRoomId();
    // }

    @GetMapping("/send-booking")
    public String sendBooking(
            @RequestParam(value = "room_id") Integer roomId,
            @RequestParam(value = "start_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
            @RequestParam(value = "end_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {

        RoomBooking booking = new RoomBooking(roomId, startDate, endDate);
        messageProducer.sendMessage("quickstart-events", booking);
        return "Booking sent for room ID " + booking.getRoomId();
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        messageProducer.sendMessage("quickstart-events", message);
        return "Message sent: " + message;
    }
}
