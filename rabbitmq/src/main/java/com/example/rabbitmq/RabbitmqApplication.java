package com.example.rabbitmq;

import com.example.rabbitmq.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * 启动程序
 *
 * @author wangwb
 * @date 2019/3/4
 **/
@SpringBootApplication
@EnableConfigurationProperties(ApplicationProperties.class)
public class RabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitmqApplication.class, args);
    }

}
