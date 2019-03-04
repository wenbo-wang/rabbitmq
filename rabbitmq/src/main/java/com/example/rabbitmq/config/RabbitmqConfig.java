package com.example.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Rabbitmq Config
 *
 * @author wangwb
 * @date 2019/3/4
 **/
@Configuration
public class RabbitmqConfig {

    private final ApplicationProperties application;

    @Autowired
    public RabbitmqConfig(ApplicationProperties application) {
        this.application = application;
    }

    @Bean
    public Queue queue() {
        return new Queue(application.getQueue(), true);
    }
}
