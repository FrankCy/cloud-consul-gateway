package com.sc.csl.config.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.config.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/16 下午3:26
 * @mofified By:
 */
@RestController
public class ConfigController {

    private static final Log logger = LogFactory.getLog(ConfigController.class);

    /**
     * 读取远程配置
     */
    @Value("${foo.bar.name}")
    private String name;

    /**
     * @description：将配置展示在页面
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2019/1/16 下午3:27
     * @mofified By:
     */
    @GetMapping("/getName")
    public String getName(){
        return name;
    }

}
