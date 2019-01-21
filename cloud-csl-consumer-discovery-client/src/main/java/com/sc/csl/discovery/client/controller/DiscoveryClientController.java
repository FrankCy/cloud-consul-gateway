package com.sc.csl.discovery.client.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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
 * @package: com.sc.csl.discovery.client.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/17 下午2:50
 * @mofified By:
 */
@RestController
public class DiscoveryClientController {

    private static final Log logger = LogFactory.getLog(DiscoveryClientController.class);

    /**
     * DiscoveryClient 会在程序启动时初始化
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取服务
     * @param serviceId
     * @return
     */
    @GetMapping("/getServer")
    public List<ServiceInstance> getServer(String serviceId) {
        logger.info("传递的serviceId ： " + serviceId);
        return discoveryClient.getInstances(serviceId);
    }


    /**
     * 健康检查
     * @return
     */
    @GetMapping("/actuator/health")
    public String health(){
        logger.info("DiscoveryClientController 自动检测");
        return "SUCCESS";
    }


}
