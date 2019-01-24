# cloud-gty-eureka-case #
## 简介 ##
Gateway结合Eureka进行服务发现的例子

## 工程介绍 ##
包|工程|端口|描述
|:--|:--|:--:|:---
|cloud-gty-eureka-case||| 父包
||case-consumer |8000| 服务消费者
||case-eureka | 8761 | Eureka注册中心
||case-gateway | 9000 | 基于Spring Cloud Gateway的网关server
||case-provider | 8001 | 服务提供者

## 启动顺序（asc） ##
- case-eureka
- case-provider
- case-consumer
- case-gateway

## 访问 ##
[访问地址：localhost:9000/case-consumer/hello/frank](localhost:9000/case-consumer/hello/frank)
控制台打印：
```java
Hello ' frank
Thu Jan 24 16:35:58 CST 2019
```