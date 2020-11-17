package com.geek.spring.homework.jdbc_dbpool.tx_hikaripool.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description: spring的配置类，相当于bean.xml
 */

@Configuration
@ComponentScan("com.geek.spring.homework.jdbc_dbpool")
@Import({HikariConfig.class,TransactionConfig.class})
@PropertySource("HikarijdbcConfig.properties")
@EnableTransactionManagement
public class SpringConfiguration {


}
