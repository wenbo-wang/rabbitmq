package com.example.rabbitmq.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置参数
 *
 * @author wangwb
 * @date 2019/3/4
 **/
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {
    private String queue;

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }
}
