package com.sc.csl.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.admin、
 * @email: cy880708@163.com
 * @date: 2019/1/8 下午3:12
 * @mofified By:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulAdminApplication.class, args);
    }

}
