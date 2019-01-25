package com.sc.gty.gg.filter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @description：统计某个或者某种路由的的处理时长
 * @version 1.0
 * @author: Yang.Chang
 * @email: cy880708@163.com
 * @date: 2019/1/24 下午6:30
 * @mofified By:
 */
public class CustomGatewayFilter implements GatewayFilter, Ordered {

    private static final Log logger = LogFactory.getLog(CustomGatewayFilter.class);


    private static final String COUNT_Start_TIME = "countStartTime";

    /**
     * 对路由转发的耗时进行统计
     * @param exchange
     * @param chain
     * @return
     */
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getAttributes().put(COUNT_Start_TIME, System.currentTimeMillis());
        return chain.filter(exchange).then(
                Mono.fromRunnable(() -> {
                    Long startTime = exchange.getAttribute(COUNT_Start_TIME);
                    Long endTime=(System.currentTimeMillis() - startTime);
                    if (startTime != null) {
                        logger.info(exchange.getRequest().getURI().getRawPath() + ": " + endTime + "ms");
                    }
                })
        );
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}

