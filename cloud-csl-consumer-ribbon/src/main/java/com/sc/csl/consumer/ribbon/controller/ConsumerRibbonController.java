package com.sc.csl.consumer.ribbon.controller;

import com.sc.csl.consumer.ribbon.service.HelloService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.consumer.ribbon.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/17 下午2:26
 * @mofified By:
 */
@RestController
public class ConsumerRibbonController {

    private static final Log logger = LogFactory.getLog(ConsumerRibbonController.class);

    /**
     * 方式一：Feign方式调用
     */
    @Autowired
    private HelloService helloService;

    /**
     * 方式二：RestTemplate方式调用
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 创建RestTemplate Bean，并用@LoadBalanced注解
     * @return
     */
    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 接收前端参数，使用Feign方式调用远程接口，并返回调用结果
     * @param name
     * @return
     */
    @GetMapping (value = "/hello1")
    public String hello1(String name) {
        return helloService.sayHello(name);
    }

    /**
     * 接收前端参数，使用RestTemplate方式调用远程接口，并返回调用结果
     * @param name
     * @return
     */
    @GetMapping (value = "/hello2")
    public String hello2(String name) {
        return restTemplate.getForObject("http://consul-provider/sayHello?name="+name, String.class);
    }

    /**
     * 健康检查
     * @return
     */
    @GetMapping("/actuator/health")
    public String health(){
        logger.info("consumer-ribbon客户端自动检测");
        return "SUCCESS";
    }

}
