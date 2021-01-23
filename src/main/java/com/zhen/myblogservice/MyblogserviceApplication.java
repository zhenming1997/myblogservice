package com.zhen.myblogservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.zhen.myblogservice.mapper")
public class MyblogserviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyblogserviceApplication.class, args);
    }

}
