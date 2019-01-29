package com.sc.gty.limiting.r.l;

import com.sc.gty.limiting.r.l.config.RemoteAddrKeyResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.limiting.r.l、
 * @email: cy880708@163.com
 * @date: 2019/1/29 下午3:11
 * @mofified By:
 */
@SpringBootApplication
public class RedisLuaLimitingApplication {

    @Bean(name = RemoteAddrKeyResolver.BEAN_NAME)
    public RemoteAddrKeyResolver remoteAddrKeyResolver() {
        return new RemoteAddrKeyResolver();
    }

    public static void main(String[] args) {
        SpringApplication.run(RedisLuaLimitingApplication.class, args);
    }
}
