package com.geek.spring.homework.auto_starter.user;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:
 */
@Data
@ConfigurationProperties("spring.user")
public class UserPorperties {
    private String name;
}
