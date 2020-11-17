package com.geek.spring.homework.jdbc_dbpool.tx_hikaripool.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description: 和连接数据库相关的配置类
 */
public class HikariConfig {

    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;



    //创建JdbcTemplate
    @Bean(name="jdbcTemplate")
    public JdbcTemplate createJdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }


    //创建数据源对象
    @Bean(name="dataSource")
    public DataSource createDataSource(){
//        DriverManagerDataSource ds = new DriverManagerDataSource();
//        ds.setUrl(url);

        HikariDataSource ds = new HikariDataSource();
        ds.setDriverClassName(driver);
        ds.setJdbcUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

}
