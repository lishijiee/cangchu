package com.lishijiee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class CangchuApplication {

    public static void main(String[] args) {
        SpringApplication.run(CangchuApplication.class, args);
    }

}
