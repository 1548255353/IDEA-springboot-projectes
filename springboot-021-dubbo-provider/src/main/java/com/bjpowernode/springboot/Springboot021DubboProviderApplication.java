package com.bjpowernode.springboot;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class Springboot021DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot021DubboProviderApplication.class, args);
    }

}
