package com.sc.gty.header.route;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.header.route、
 * @email: cy880708@163.com
 * @date: 2019/1/23 下午3:25
 * @mofified By:
 */
@SpringBootApplication
public class CloudGatewayHeaderRouteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayHeaderRouteApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        //判断header 对应的K／V
        return builder.routes()
                .route("header_route", r -> r.header("X-Request-Id", "frank")
                        .uri("http://localhost:8071/test/head"))
                .build();
    }

}
