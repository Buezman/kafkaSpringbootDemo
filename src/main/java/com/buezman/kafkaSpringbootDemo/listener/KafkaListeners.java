package com.buezman.kafkaSpringbootDemo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "buezman", groupId = "bx1")
    public void listener(String data) {
        System.out.println("Listener received " + data + " \uD83D\uDC4D\uD83C\uDFFB");
    }
}
