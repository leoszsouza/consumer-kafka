package com.example.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "${kafka.topic}")
    public void receive(TesteVO testeVO) {
        LOGGER.info("received testeVO='{}'", testeVO.toString());
    }
}
