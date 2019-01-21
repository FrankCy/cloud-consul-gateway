package com.sc.csl.override.provider.t1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.override.provider.t1.Controller、
 * @email: cy880708@163.com
 * @date: 2019/1/21 下午3:03
 * @mofified By:
 */
@RestController
public class OverrideProviderTag1Controller {

    /**
     * 注意：新版Spring Cloud Consul 默认注册健康检查接口为：/actuator/health
     *
     * @return SUCCESS
     */
    @GetMapping("/actuator/health")
    public String health() {
        return "SUCCESS";
    }

    /**
     * 提供 sayHello 服务:根据对方传来的名字 XX，返回:hello XX
     * @return String
     */
    @GetMapping("/sayHello")
    public String sayHello(String name){
        return "hello," + name + ". I am tag1";
    }

}
