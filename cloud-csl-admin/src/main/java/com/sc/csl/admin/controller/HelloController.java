package com.sc.csl.admin.controller;

import com.sc.csl.admin.services.HelloService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private HelloService helloService;

    /**
     * @description：接收前端传来的参数，调用远程接口，并返回调用结果
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2019/1/16 下午3:13
     * @mofified By:
     */
    @GetMapping("/hello")
    public String hello(String name){
        logger.info("输入的参数:" + name);
        String returnString = helloService.sayHello(name);
        logger.info("响应的结果:" + returnString);
        return returnString;
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
