package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
//applicationContext.xml ===ConfigBean(@Configuration)

    @LoadBalanced  // Ribbon 实现一套客户端 负载均衡的工具
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    //<bean id="getRestTemplate" class="org.springframework.web.client.RestTemplate">

    @Bean
    public IRule myRule(){
        //return new RandomRule();//选择随机算法 选取提供者
        return new RetryRule(); //变种 轮询 (撞几次头就不撞了)
    }
}
