package com.sc.gty.after.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.after.route、
 * @email: cy880708@163.com
 * @date: 2019/1/22 下午5:54
 * @mofified By:
 */
@SpringBootApplication
public class CloudGatewayAfterRouteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayAfterRouteApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        ZonedDateTime minusTime = LocalDateTime.now().minusHours(1).atZone((ZoneId.systemDefault()));
        System.out.println("minusTime : " + minusTime);
        return builder.routes().route("after_route", r -> r.after(minusTime).uri("http://baidu.com")).build();
    }

}
