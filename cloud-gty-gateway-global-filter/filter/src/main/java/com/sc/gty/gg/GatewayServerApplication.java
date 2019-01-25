package com.sc.gty.gg;

import com.sc.gty.gg.filter.CustomGatewayFilter;
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
 * @package: com.sc.gty.gg.filter、
 * @email: cy880708@163.com
 * @date: 2019/1/24 下午6:29
 * @mofified By:
 */
@SpringBootApplication
public class GatewayServerApplication {

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/test")
                        .filters(f -> f.filter(new CustomGatewayFilter()))
                        .uri("http://localhost:8001/customFilter?name=frank")
                        .order(0)
                        .id("custom_filter")
                )
                .build();
    }
    public static void main(String[] args) {
        SpringApplication.run(GatewayServerApplication.class, args);
    }

}