package com.example.BookingService.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        messageProducer.sendMessage("quickstart-events", message);
        return "Message sent: " + message;
    }

    @GetMapping("/greeting")
    public String greeting() {

        return "Message sent: ";
    }

}