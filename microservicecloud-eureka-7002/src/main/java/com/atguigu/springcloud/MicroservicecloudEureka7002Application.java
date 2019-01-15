package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer     //EurekaServer服务器端 启动类,接受 其它微服务 注册进来
public class MicroservicecloudEureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudEureka7002Application.class, args);
    }

}

