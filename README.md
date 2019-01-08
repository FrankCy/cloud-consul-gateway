# Spring Cloud 2.0+（第二代） #
#### 基于Spring Boot 2.0+ F版  ####
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