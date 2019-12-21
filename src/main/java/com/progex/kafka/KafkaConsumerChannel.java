package com.progex.kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface KafkaConsumerChannel {
    String INPUT_CHANNEL = "input_channel";

    @Input(INPUT_CHANNEL)
    SubscribableChannel onReceive();
}
