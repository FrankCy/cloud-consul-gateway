package com.sc.csl.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.config、
 * @email: cy880708@163.com
 * @date: 2019/1/16 下午3:24
 * @mofified By:
 */
@SpringBootApplication
@RefreshScope
public class ConsulConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConfigApplication.class, args);
    }

}
