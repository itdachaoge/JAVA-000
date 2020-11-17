package com.geek.spring.homework.spirng_bean.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhangycl
 * @date: 2020/11/16
 * @description:
 */
@Configuration
public class SpringConfiguration {


    @Bean
    public AccountDaoImpl getAccountDaoImpl() {
        return new AccountDaoImpl();
    }

}
