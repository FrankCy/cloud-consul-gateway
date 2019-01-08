package com.sc.csl.admin.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.csl.admin.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/8 下午5:03
 * @mofified By:
 */
@Controller
public class HelloController {

    private static final Log logger = LogFactory.getLog(HelloController.class);

    /**
     * @description：
     * @version 1.0
     * @author: Yang.Chang
     * @email: cy880708@163.com
     * @date: 2019/1/8 下午4:44
     * @mofified By:
     */
    @RequestMapping(value = "index")
    public ModelAndView consulIndex() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        logger.info("登录系统，请求Index啦");
        return modelAndView;
    }
}
