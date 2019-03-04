package com.example.rabbitmq.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Producer
 *
 * A program that sends messages is a producer
 *
 * @author wangwb
 * @date 2019/3/4
 **/
@Component
public class Producer{

    private Logger logger = LoggerFactory.getLogger(Producer.class);

    private final RabbitTemplate rabbitTemplate;

    private final Queue queue;

    @Autowired
    public Producer(RabbitTemplate rabbitTemplate, Queue queue) {
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    public void send(String passenger){

        logger.info("{}","开始发送旅客 : " + passenger);
        rabbitTemplate.convertSendAndReceive(queue.getName(),passenger);
        logger.info("{}","旅客发送完成 : " + passenger);
    }
}
