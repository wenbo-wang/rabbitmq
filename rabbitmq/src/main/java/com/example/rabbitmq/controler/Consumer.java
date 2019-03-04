package com.example.rabbitmq.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Consumer
 *
 * A consumer is a program that mostly waits to receive messages:
 *
 * @author wangwb
 * @date 2019/3/4
 **/
@Component
public class Consumer {

    private Logger logger = LoggerFactory.getLogger(Consumer.class);

    @RabbitListener(queues = "${application.queue}")
    public void processMessage(String passenger)  {
        logger.info("{}",Thread.currentThread().getName() + " 景德镇站接收到南昌站发来的旅客：" + passenger);
    }
}
