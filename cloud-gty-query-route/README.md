# cloud-gty-query-route #
## 简介 ##
根据请求中的两个参数进行断言匹配，断言匹配成功进行转发，否则不进行转发。
例如地址：http://localhost:8081?flag=main，此地址后面的参数flag=main，在应用程序中配置对应的匹配，匹配则通过，不匹配则不通过。