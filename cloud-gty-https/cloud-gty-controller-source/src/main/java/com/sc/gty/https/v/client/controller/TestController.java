package com.sc.gty.https.v.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.https.v.client.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/28 下午5:29
 * @mofified By:
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String prefixpath(){
        return "https to Http";
    }
}
