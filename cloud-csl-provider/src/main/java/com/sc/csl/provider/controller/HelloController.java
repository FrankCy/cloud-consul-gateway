package com.sc.csl.provider.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.admin.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/8 下午5:03
 * @mofified By:
 */
@RestController
public class HelloController {

    private static final Log logger = LogFactory.getLog(HelloController.class);


    /**
     * @description：新版Spring Cloud Consul 默认注册健康检查接口为：/actuator/health
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2019/1/16 下午3:02
     * @mofified By:

    @GetMapping("/actuator/health")
    public String actuatorHealth() {
        logger.info("健康检查");
        return "SUCCESS";
    }
     */

    /**
     * @description：自定义健康检查，默认的请求地址是/actuator/health
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2019/1/17 下午12:58
     * @mofified By:
     */
    @GetMapping("/health")
    public String health() {
        logger.info("自定义健康检查");
        return "SUCCESS";
    }

    /**
     * @description：提供 sayHello 服务:根据对方传来的名字 XX，返回:hello XX
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2019/1/16 下午3:02
     * @mofified By:
     */
    @GetMapping("/sayHello")
    public String sayHello(String name){
        logger.info("sayHello被请求了");
        return "hello," + name;
    }

}
