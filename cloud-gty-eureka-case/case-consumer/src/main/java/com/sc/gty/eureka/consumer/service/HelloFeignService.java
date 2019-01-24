package com.sc.gty.eureka.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.eureka.consumer.service、
 * @email: cy880708@163.com
 * @date: 2019/1/24 下午3:23
 * @mofified By:
 */
@FeignClient(name = "case-producer")
public interface HelloFeignService {

    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);

}
