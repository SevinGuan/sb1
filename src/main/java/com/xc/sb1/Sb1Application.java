package com.xc.sb1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xc.sb1.mapper")
public class Sb1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb1Application.class, args);
    }

}
