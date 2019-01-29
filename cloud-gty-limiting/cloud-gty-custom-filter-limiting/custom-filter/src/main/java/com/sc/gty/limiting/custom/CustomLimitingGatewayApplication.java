package com.sc.gty.limiting.custom;

import com.sc.gty.limiting.custom.filter.GatewayRateLimitFilterByIp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

import java.time.Duration;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.limiting.custom、
 * @email: cy880708@163.com
 * @date: 2019/1/29 下午1:16
 * @mofified By:
 */
@SpringBootApplication
public class CustomLimitingGatewayApplication {

    /**
     * 通过流式API配置路由规则，当访问/test/rateLimit时，自动转发到http://localhost:8000/hello/rateLimit
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator customerRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/test/rateLimit")
                        .filters(f -> f.filter(new GatewayRateLimitFilterByIp(10,1, Duration.ofSeconds(1))))
                        .uri("http://localhost:8000/hello/rateLimit")
                        .id("rateLimit_route")
                ).build();
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomLimitingGatewayApplication.class, args);
    }
}
