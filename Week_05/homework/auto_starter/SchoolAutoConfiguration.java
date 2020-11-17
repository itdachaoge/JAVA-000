package com.geek.spring.homework.auto_starter;

import com.geek.spring.homework.auto_starter.SchoolPorperties;
import com.geek.spring.homework.auto_starter.user.UserClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:
 */
@Configuration
@EnableConfigurationProperties(SchoolPorperties.class)
public class SchoolAutoConfiguration {


    @Bean
    @ConditionalOnProperty(prefix = "spring.school", value = "enabled", havingValue = "true")
    public SchoolClient schoolClient(SchoolPorperties schoolPorperties) {
        return new SchoolClient(schoolPorperties);
    }
}
