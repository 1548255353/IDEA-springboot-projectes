package com.bjpowernode.springboot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Springboot022DubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot022DubboConsumerApplication.class, args);
    }

}
