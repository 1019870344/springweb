package com.example.springweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springweb.mapper")

public class SpringwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringwebApplication.class, args);
    }

}
