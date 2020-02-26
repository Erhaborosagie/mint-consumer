package com.example.demo.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created by Osagie Erhabor on 26/02/2020.
 */
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "com.ng.vela.even.card_verified", groupId = "group_id")
    public void consume(String message){
        System.out.println("Message: " + message);
    }
}
