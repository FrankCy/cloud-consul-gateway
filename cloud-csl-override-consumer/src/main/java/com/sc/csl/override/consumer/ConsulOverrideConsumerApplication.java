package com.sc.csl.override.consumer;

import com.ecwid.consul.v1.ConsulClient;
import com.sc.csl.override.consumer.config.MyConsulDiscoveryClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.override.consumer、
 * @email: cy880708@163.com
 * @date: 2019/1/21 下午2:40
 * @mofified By:
 */
@SpringBootApplication
public class ConsulOverrideConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOverrideConsumerApplication.class, args);
    }

    /**
     * 自定义 DiscoveryClient
     * @Order 代表先加载
     * @param client
     * @param properties
     * @return
     */
    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public MyConsulDiscoveryClient ConsulDiscoveryClient(ConsulClient client, ConsulDiscoveryProperties properties){
        return new MyConsulDiscoveryClient(client,properties);
    }


}
