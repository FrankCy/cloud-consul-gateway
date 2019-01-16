package com.sc.csl.admin.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.admin.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/8 下午3:15
 * @mofified By:
 */
@RestController
public class ConsulAdminController {

    @Autowired
    private DiscoveryClient discoveryClient;

    private static final Log logger = LogFactory.getLog(ConsulAdminController.class);

    /**
     * @description：获取所有服务
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2019/1/8 下午4:46
     * @mofified By:
     */
    @RequestMapping("/services")
    public String services() {
        List<String> services = discoveryClient.getServices();
        String serviceStr = services.toString();
        logger.info(serviceStr);
        return serviceStr;
    }

    /**
     * @description：健康检查
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2019/1/16 下午2:53
     * @mofified By:
     */
    @GetMapping("/actuator/health")
    public String health(){
        return "SUCCESS";
    }
}