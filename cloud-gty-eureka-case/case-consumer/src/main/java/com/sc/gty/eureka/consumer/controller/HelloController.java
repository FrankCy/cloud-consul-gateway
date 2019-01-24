package com.sc.gty.eureka.consumer.controller;

import com.sc.gty.eureka.consumer.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.eureka.consumer.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/24 下午3:22
 * @mofified By:
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    HelloFeignService helloRemote;

    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name)  {
        return helloRemote.hello(name) + "\n" + new Date().toString();
    }
}
