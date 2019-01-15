package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule()
    {
        //return new RandomRule();//Ribbon默认是轮询，选择为随机
        return new RandomRule_ZY();//自定义的
        //问题：依旧轮询策略，但是加上新需求，每个服务器要求被调用5次。也即
        //以前是每台机器一次，现在是每台机器5次
    }
}

