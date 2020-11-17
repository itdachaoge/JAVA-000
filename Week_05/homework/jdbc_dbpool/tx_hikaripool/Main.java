package com.geek.spring.homework.jdbc_dbpool.tx_hikaripool;

import com.geek.spring.homework.jdbc_dbpool.tx_hikaripool.config.SpringConfiguration;

import com.geek.spring.homework.jdbc_dbpool.tx_hikaripool.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhang
 * @date: 2020/11/17
 * @description:
 */

public class Main {

    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //2.根据id获取Bean对象
        IAccountService accountService = ac.getBean("accountService", IAccountService.class);

        System.out.println(accountService);   //com.geek.spring.homework.jdbc_dbpool.tx_batch.service.AccountServiceImpl@3c3d9b6b
        accountService.transfer("aaa","bbb",100f);
    }



}
