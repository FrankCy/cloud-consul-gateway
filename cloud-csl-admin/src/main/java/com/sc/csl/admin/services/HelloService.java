package com.sc.csl.admin.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.admin.services、
 * @email: cy880708@163.com
 * @date: 2019/1/16 下午2:58
 * @mofified By:
 */
@FeignClient("consul-provider")
public interface HelloService {

    /**
     * @description：接收信息并返回一句话
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2019/1/16 下午3:50
     * @mofified By:
     */
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name);

}
