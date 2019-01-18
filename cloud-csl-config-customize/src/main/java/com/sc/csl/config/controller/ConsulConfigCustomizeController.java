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
 * @date: 2019/1/18 下午2:23
 * @mofified By:
 */
@RestController
public class ConsulConfigCustomizeController {

    /**
     * 日志
     */
    private static final Log logger = LogFactory.getLog(ConsulConfigCustomizeController.class);

    /**
     * 读取远程配置
     */
    @Value("${foo.bar.name}")
    private String name;

    /**
     * 读取远程配置
     */
    @Value("${foo.bar.des}")
    private String des;

    /**
     * 将配置展示在页面
     * @return
     */
    @GetMapping("/getName")
    public String getName() {
        logger.info("配置是：" + name);
        logger.info("配置是：" + des);
        return name + " ---- " + des;
    }

}
