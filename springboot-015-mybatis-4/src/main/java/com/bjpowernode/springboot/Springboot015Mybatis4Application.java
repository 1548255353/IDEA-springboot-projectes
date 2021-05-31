package com.bjpowernode.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bjpowernode.springboot.mapper")
public class Springboot015Mybatis4Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot015Mybatis4Application.class, args);
    }

}
