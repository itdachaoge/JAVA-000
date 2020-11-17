package com.geek.spring.homework.auto_starter.user;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author: zhang
 * @date: 2020/11/17
 * @description:
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({UserAutoConfiguration.class})
public @interface EnableUserClient {
}
