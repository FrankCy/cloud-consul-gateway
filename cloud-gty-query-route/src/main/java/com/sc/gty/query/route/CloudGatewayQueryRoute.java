package com.sc.gty.query.route;

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
 * @package: com.sc.gty.query.route、
 * @email: cy880708@163.com
 * @date: 2019/1/23 下午4:41
 * @mofified By:
 */
@SpringBootApplication
public class CloudGatewayQueryRoute {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayQueryRoute.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        //判断header 对应的K／V
        return builder.routes()
                .route("query_route", r -> r.query("flag", "main")
                        .uri("http://baidu.com"))
                .build();
    }

}
