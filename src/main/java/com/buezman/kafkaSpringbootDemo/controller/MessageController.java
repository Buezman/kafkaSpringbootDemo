package com.buezman.kafkaSpringbootDemo.controller;

import com.buezman.kafkaSpringbootDemo.request.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/messages")
public class MessageController {

    private final KafkaTemplate<String,String> kafkaTemplate;


    @PostMapping
    public void publish(@RequestBody MessageRequest messageRequest) {
        kafkaTemplate.send("buezman", messageRequest.message + " \uD83D\uDC4D\uD83C\uDFFB");
    }
}
