package com.sc.gty.gg.filter.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description：
 * @version 1.0
 * @author: Yang.Chang
 * @email: cy880708@163.com
 * @date: 2019/1/24 下午6:30
 * @mofified By:
 */
@RestController
public class HelloController {

    @GetMapping("/customFilter")
    public String customFilter(@RequestParam String name) {
        return "customFilter, " + name + "!";
    }
}
