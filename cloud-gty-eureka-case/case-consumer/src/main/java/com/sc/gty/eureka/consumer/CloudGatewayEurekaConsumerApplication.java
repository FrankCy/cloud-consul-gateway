package com.sc.gty.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.eureka.consumer、
 * @email: cy880708@163.com
 * @date: 2019/1/24 下午3:19
 * @mofified By:
 */
@SpringBootApplication
@EnableFeignClients
public class CloudGatewayEurekaConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayEurekaConsumerApplication.class, args);
    }
}
