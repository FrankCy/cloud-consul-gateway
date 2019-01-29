package com.sc.gty.limiting.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description：
 * @version 1.0
 * @author: Yang.Chang
 * @email: cy880708@163.com
 * @date: 2019/1/29 下午2:04
 * @mofified By:
 */
@RequestMapping("/hello")
@RestController
public class HelloController {

    @GetMapping("/rateLimit")
    public String hello() {
        return "Hello, spring cloud Gateway";
    }

}