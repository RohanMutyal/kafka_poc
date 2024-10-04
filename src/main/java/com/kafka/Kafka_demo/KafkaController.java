package com.kafka.Kafka_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaProducer producer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        producer.sendMessage("test_topic", message);
        return "Message sent";
    }
}
