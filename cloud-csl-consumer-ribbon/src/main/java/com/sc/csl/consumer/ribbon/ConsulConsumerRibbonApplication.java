package com.sc.csl.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.consumer.ribbon、
 * @email: cy880708@163.com
 * @date: 2019/1/17 下午2:25
 * @mofified By:
 */
@EnableFeignClients
@SpringBootApplication
public class ConsulConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConsumerRibbonApplication.class, args);
    }

}
