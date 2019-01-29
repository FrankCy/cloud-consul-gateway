package com.sc.gty.limiting.cpu;

import com.sc.gty.limiting.cpu.filter.GatewayRateLimitFilterByCpu;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @package: com.sc.gty.limiting.cpu、
 * @email: cy880708@163.com
 * @date: 2019/1/29 下午4:30
 * @mofified By:
 */
@SpringBootApplication
public class CpuLimitingGatewayApplication {

    @Autowired
    private GatewayRateLimitFilterByCpu gatewayRateLimitFilterByCpu;

    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/test/rateLimit")
                        .filters(f -> f.filter(gatewayRateLimitFilterByCpu))
                        .uri("http://localhost:8000/hello/rateLimit")
                        .id("rateLimit_route")
                ).build();
    }
    public static void main(String[] args) {
        SpringApplication.run(CpuLimitingGatewayApplication.class, args);
    }
}
