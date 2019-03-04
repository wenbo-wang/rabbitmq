package com.example.rabbitmq;

import com.example.rabbitmq.controler.Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {

    private Logger logger = LoggerFactory.getLogger(RabbitmqApplicationTests.class);

    @Test
    public void contextLoads() {
    }

    @Autowired
    private Producer producer;

    @Test
    public void sendTest() throws Exception {
        String[] passengers = {"张三","李四","王五"};
        for (String passenger : passengers) {
            logger.info("{}","南昌站发送旅客  "+passenger);
            producer.send(passenger);
            Thread.sleep(1000);
        }
    }

}
