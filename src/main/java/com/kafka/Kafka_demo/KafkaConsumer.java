package com.kafka.Kafka_demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test_topic", groupId = "mygroup")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
