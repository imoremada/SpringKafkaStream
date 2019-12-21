package com.progex.service;

import com.progex.kafka.KafkaProducerChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(KafkaProducerChannel.class)
@Slf4j
public class Producer implements MessageAdapter {

    @Autowired
    private KafkaProducerChannel outputChannel;

    @Override
    public void sendMessage(String message) {
        log.info("Sending message : {} to topic : {}", message, KafkaProducerChannel.OUTPUT_CHANNEL);
        outputChannel.sendMessage()
                .send(MessageBuilder.withPayload(message).build());
    }
}