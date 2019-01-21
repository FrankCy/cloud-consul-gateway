package com.sc.csl.override.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.override.consumer.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/21 下午2:42
 * @mofified By:
 */
@RestController
public class OverrideConsumerController {

    @Autowired
    private DiscoveryClient discoveryClient;

    // 这里只举例获取服务方信息,不去请求服务方接口
    @GetMapping("/getServer")
    public List<ServiceInstance> getServer(String serviceId){
        return discoveryClient.getInstances(serviceId);
    }

    @GetMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }

}
