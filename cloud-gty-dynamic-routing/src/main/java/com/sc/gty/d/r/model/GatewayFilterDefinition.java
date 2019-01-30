package com.sc.gty.d.r.model;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @version 1.0
 * @description：过滤器定义模型
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.d.r.model、
 * @email: cy880708@163.com
 * @date: 2019/1/30 上午11:56
 * @mofified By:
 */
public class GatewayFilterDefinition {

    /**
     * Filter Name
     */
    private String name;

    /**
     * 对应的路由规则
     */
    private Map<String, String> args = new LinkedHashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
    }

}
