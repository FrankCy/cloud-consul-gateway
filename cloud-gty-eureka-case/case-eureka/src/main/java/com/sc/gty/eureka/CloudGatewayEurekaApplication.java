package com.sc.gty.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.eureka.eureka、
 * @email: cy880708@163.com
 * @date: 2019/1/24 下午3:39
 * @mofified By:
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudGatewayEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayEurekaApplication.class, args);
    }
}
