package com.sc.csl.consumer.ribbon.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version 1.0
 * @description：使用OpenFeign，调用远程服务
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.consumer.ribbon.service、
 * @email: cy880708@163.com
 * @date: 2019/1/17 下午2:26
 * @mofified By:
 */
@FeignClient("consul-provider")
public interface HelloService {

    /**
     * 用OpenFeign，调用远程服务 [接收信息并返回一句话]
     * @param name
     * @return
     */
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name);

}

