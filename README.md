# Spring Cloud 2.0+（第二代） #
#### 基于Spring Boot 2.0+ F版  ####
[第一代](https://github.com/FrankCy/cloud)
## 简介 ##
第二代微服务解决方案

## 工程介绍 ##
工程|端口|描述
---|:--:|:---
cloud-2|N/A|父节点

## 技术中间件 ##
中间件|描述
:---|:---
Gateway|API 网关
Consul|注册中心
Apollo|配置中心
Sleuth + Skywalking|全链路监控
Open Feign| 服务端负载均衡

### 中间件简述 ###
- Consul <br/>
替代Eureka作为服务注册发现，与Eureka不同，无需编写Server端，安装配置（默认端口8500）之后，启动Consul（我理解是注册中心服务端），然后在Consul客户端启动程序加入注解@EnableDiscoveryClient，即将服务发布了。具体参数在yml中修改。

## 其它组件 ##
组件|描述
:---|:---
Redis Jedis|缓存
MongoDB|NoSql数据库
OpenResty|给予Nginx与Lua的高性能Web平台，用于直接通过Lua使用Redis
Lua|调用Redis时的编程语言

## 功能地址 ##
序号|地址|描述
:---|:---|:---
1|http://127.0.0.1:8081/index|首页|
