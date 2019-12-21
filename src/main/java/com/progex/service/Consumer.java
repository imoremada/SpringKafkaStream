package com.progex.service;

import com.progex.kafka.KafkaConsumerChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;

@EnableBinding(KafkaConsumerChannel.class)
@Slf4j
public class Consumer {

    @StreamListener(target = KafkaConsumerChannel.INPUT_CHANNEL)
    public void handle(Message<?> message) {
        log.info("Received a message : {}" + message);
        Acknowledgment acknowledgment = message.getHeaders().get(KafkaHeaders.ACKNOWLEDGMENT, Acknowledgment.class);
        if (acknowledgment != null) {
            log.info("Acknowledgement has been done");
            acknowledgment.acknowledge();
        }
    }


}