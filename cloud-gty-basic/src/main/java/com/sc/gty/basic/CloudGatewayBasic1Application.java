package com.sc.gty.basic;

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
 * @package: PACKAGE_NAME、
 * @email: cy880708@163.com
 * @date: 2019/1/21 下午6:42
 * @mofified By:
 */
@SpringBootApplication
public class CloudGatewayBasic1Application {

    /**
     * 通过JAVA流式API自定义RouteLocatorBuilder方式定义Spring Cloud Gateway路由
     * @param builder
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // basic proxy
                .route(r -> r.path("/jd")
                                .uri("http://jd.com:80/")
                                    .id("jd_route")
                        ).build();
    }


    public static void main(String[] args) {
        SpringApplication.run(CloudGatewayBasic1Application.class, args);
    }

}
