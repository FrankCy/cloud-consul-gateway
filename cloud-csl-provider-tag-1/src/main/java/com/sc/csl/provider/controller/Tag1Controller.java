package com.sc.csl.provider.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: provider.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/17 下午2:15
 * @mofified By:
 */
@RestController
public class Tag1Controller {

    private static final Log logger = LogFactory.getLog(Tag1Controller.class);

    /**
     * @description：自定义健康检查，默认的请求地址是/actuator/health
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2019/1/17 下午12:58
     * @mofified By:
     */
    @GetMapping("/actuator/health")
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
        return "hello," + name + ", 我是Tag1";
    }
}
