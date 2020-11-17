package com.geek.spring.homework.auto_starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: zhang
 * @date: 2020/11/17
 * @description:
 */
@SpringBootApplication
@EnableSchoolClient
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
