# Spring Cloud 2.0+（第二代） #
#### 基于Spring Boot 2.0+ F版  ####
[🦆🦆🦆 【先代】 GitHub地址 🦆🦆🦆](https://github.com/FrankCy/cloud)
## 简介 ##
第二代微服务解决方案

## 工程介绍 ##
分类|工程|端口|描述
|:---|:--|:--:|:---
|包 |cloud-2|N/A|父节点
|基础 | | |
| | cloud-csl-provider|8081|Consul注册中心
| |cloud-csl-admin|8082|Consul客户端
| |cloud-csl-config|8083|Consul配置
|Consul集群 | | |
| |cloud-csl-provider-tag1|8081|tag1服务提供者
| |cloud-csl-provider-tag2|8082|tag2服务提供者
| |cloud-csl-consumer-ribbon|8083|两种方式服务发现
| |cloud-csl-consumer-discovery-client|8084|自定义客户端服务发现
|Config profils配置 | | |
| |cloud-csl-config-customize|8082 / 8083 <br/> ```取决application.yml中的active```|profils配置
|Discovery Client  自定义 | | |
| |cloud-csl-override-consumer| | ```未测试```
| |cloud-csl-override-provider-tag-1| 8081 | ```未测试```
| |cloud-csl-override-provider-tag-2| 8082 | ```未测试```
|Gateway 练习 | | |
| |cloud-gty-basic-application| 8080 | ```通过启动程序Java代码实现网关路由```
| |cloud-gty-basic-yml| 8080 | ```通过yml配置文件实现网关路由（常用）```


## 技术中间件 ##
中间件|描述
:---|:---
Gateway|API 网关
Consul|注册中心
gRPC|Google研发高效RPC
Sleuth + Skywalking|全链路监控

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

## 启动顺序 ##

## 功能地址 ##
序号|地址|描述
:---|:---|:---
1|http://127.0.0.1:8081/index|首页|
