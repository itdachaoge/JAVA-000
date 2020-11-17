package com.geek.spring.homework.auto_starter;

import com.geek.spring.homework.auto_starter.SchoolAutoConfiguration;
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
@Import({SchoolAutoConfiguration.class})
public @interface EnableSchoolClient {
}
