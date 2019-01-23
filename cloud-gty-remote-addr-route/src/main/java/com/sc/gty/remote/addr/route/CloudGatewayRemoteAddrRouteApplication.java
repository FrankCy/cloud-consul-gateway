package com.sc.gty.remote.addr.route;

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
 * @package: com.sc.gty.remote.addr.route、
 * @email: cy880708@163.com
 * @date: 2019/1/23 下午5:05
 * @mofified By:
 */
@SpringBootApplication
public class CloudGatewayRemoteAddrRouteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayRemoteAddrRouteApplication.class, args);
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        //判断网段，在127.0.0.1内的都可以断言路由成功
        return builder.routes()
                .route("remoteaddr_route", r -> r.remoteAddr("127.0.0.1")
                        .uri("http://baidu.com"))
                .build();
    }
}
