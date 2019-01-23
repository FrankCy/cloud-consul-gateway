package com.sc.gty.method.route;

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
 * @package: com.sc.gty.method.route、
 * @email: cy880708@163.com
 * @date: 2019/1/23 下午4:30
 * @mofified By:
 */
@SpringBootApplication
public class CloudGatewayMethodRouteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayMethodRouteApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        //判断header 对应的K／V
        return builder.routes()
                .route("method_route", r -> r.method("GET")
                        .uri("http://jd.com"))
                .build();
    }

}
