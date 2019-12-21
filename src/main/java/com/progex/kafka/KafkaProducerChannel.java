package com.progex.kafka;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

@Component
public interface KafkaProducerChannel {

    String OUTPUT_CHANNEL = "output_channel";

    @Output(OUTPUT_CHANNEL)
    MessageChannel sendMessage();
}
