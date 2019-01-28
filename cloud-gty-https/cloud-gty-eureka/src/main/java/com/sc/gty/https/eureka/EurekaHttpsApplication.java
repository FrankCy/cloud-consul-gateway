package com.sc.gty.https.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.https.eureka、
 * @email: cy880708@163.com
 * @date: 2019/1/28 下午5:25
 * @mofified By:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaHttpsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaHttpsApplication.class, args);
    }
}
