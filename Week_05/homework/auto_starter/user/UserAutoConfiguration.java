package com.geek.spring.homework.auto_starter.user;

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
@EnableConfigurationProperties(UserPorperties.class)
public class UserAutoConfiguration {


    @Bean
    @ConditionalOnProperty(prefix = "spring.user", value = "enabled", havingValue = "true")
    public UserClient userClient(UserPorperties userPorperties) {
        return new UserClient(userPorperties);
    }
}
