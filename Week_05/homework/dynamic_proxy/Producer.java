package com.geek.spring.homework.dynamic_proxy;

/**
 * @author: zhangycl
 * @date: 2020/11/16
 * @description: 顾客付出的总钱数= 销售钱数 + 售后钱数
 */
public class Producer implements IProducer {

    /**
     * 销售
     * @param money
     */
    @Override
    public void saleProduct(float money) {
        System.out.println("销售产品，并拿到钱:" + money);
    }

    /**
     * 售后
     * @param money
     */
    @Override
    public void afterService(float money) {
        System.out.println("提供售后服务，并拿到钱："+money);
    }
}
