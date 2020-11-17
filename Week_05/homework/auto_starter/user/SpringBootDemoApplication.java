package com.geek.spring.homework.auto_starter.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:
 */
@SpringBootApplication
@EnableUserClient
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
