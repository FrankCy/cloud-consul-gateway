package com.sc.gty.cookie.route;

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
 * @package: com.sc.gty.cookie.route、
 * @email: cy880708@163.com
 * @date: 2019/1/23 下午1:24
 * @mofified By:
 */
@SpringBootApplication
public class CloudGatewayCookieRoute {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayCookieRoute.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        //判断Cookie K（chocolate）对应的V是不是（ch.p），是的话路由到http://localhost:8071/test/cookie地址
        return builder.routes()
                .route("cookie_route", r -> r.cookie("chocolate", "ch.p")
                        .uri("http://localhost:8071/test/cookie"))
                .build();
    }

}
