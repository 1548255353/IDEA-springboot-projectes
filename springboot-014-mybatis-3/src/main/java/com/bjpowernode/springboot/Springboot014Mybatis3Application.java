package com.bjpowernode.springboot;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.bjpowernode.springboot.mapper")
public class Springboot014Mybatis3Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot014Mybatis3Application.class, args);
    }

}
