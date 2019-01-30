package com.sc.gty.d.r.controller;

import com.sc.gty.d.r.model.GatewayPredicateDefinition;
import com.sc.gty.d.r.model.GatewayRouteDefinition;
import com.sc.gty.d.r.route.DynamicRouteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.handler.predicate.PredicateDefinition;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @description：
 * @author: Yang.Chang
 * @project: cloud-master
 * @package: com.sc.gty.d.r.controller、
 * @email: cy880708@163.com
 * @date: 2019/1/30 下午12:01
 * @mofified By:
 */
@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private DynamicRouteServiceImpl dynamicRouteService;

    /**
     * 增加路由
     * @param gwdefinition
     * @return
     */
    @PostMapping("/add")
    public String add(@RequestBody GatewayRouteDefinition gwdefinition) {
        try {
            RouteDefinition definition = assembleRouteDefinition(gwdefinition);
            return this.dynamicRouteService.add(definition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "succss";
    }

    /**
     * 删除路由
     * @param id
     * @return
    */
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        return this.dynamicRouteService.delete(id);
    }

    /**
     * 更新路由
     * @param gwdefinition
     * @return
     */
    @PostMapping("/update")
    public String update(@RequestBody GatewayRouteDefinition gwdefinition) {
        RouteDefinition definition = assembleRouteDefinition(gwdefinition);
        return this.dynamicRouteService.update(definition);
    }

    /**
     * 集群路由
     * @param gwdefinition
     * @return
     */
    private RouteDefinition assembleRouteDefinition(GatewayRouteDefinition gwdefinition) {
        RouteDefinition definition = new RouteDefinition();
        List<PredicateDefinition> pdList=new ArrayList<>();
        definition.setId(gwdefinition.getId());
        List<GatewayPredicateDefinition> gatewayPredicateDefinitionList=gwdefinition.getPredicates();
        for (GatewayPredicateDefinition gpDefinition: gatewayPredicateDefinitionList) {
            PredicateDefinition predicate = new PredicateDefinition();
            predicate.setArgs(gpDefinition.getArgs());
            predicate.setName(gpDefinition.getName());
            pdList.add(predicate);
        }
        definition.setPredicates(pdList);
        URI uri = UriComponentsBuilder.fromHttpUrl(gwdefinition.getUri()).build().toUri();
        definition.setUri(uri);
        return definition;
    }

}