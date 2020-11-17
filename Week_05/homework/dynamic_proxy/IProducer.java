package com.geek.spring.homework.dynamic_proxy;

/**
 * @author: zhangycl
 * @date: 2020/11/16
 * @description: 对生产厂家要求的接口
 */
public interface IProducer {
    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money);

    /**
     * 售后
     * @param money
     */
    public void afterService(float money);
}
