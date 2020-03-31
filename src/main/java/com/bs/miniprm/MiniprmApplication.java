package com.bs.miniprm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 李宇超
 */
@SpringBootApplication
@MapperScan(basePackages = "com.bs.miniprm.mapper")
public class MiniprmApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniprmApplication.class, args);
    }

}
