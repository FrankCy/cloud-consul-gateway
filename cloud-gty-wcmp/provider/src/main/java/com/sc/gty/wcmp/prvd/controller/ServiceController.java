package com.sc.gty.wcmp.prvd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.wcmp.prvd.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/28 下午2:28
 * @mofified By:
 */
@RestController
public class ServiceController {

    @GetMapping(value = "/v1")
    public String v1() {
        return "v1";
    }

    @GetMapping(value = "/v2")
    public String v2() {
        return "v2";
    }

}
