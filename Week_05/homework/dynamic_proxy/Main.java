package com.geek.spring.homework.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: zhangycl
 * @date: 2020/11/16
 * @description: 模拟一个顾客，
 */
public class Main {

    public static void main(String[] args) {
        final Producer producer = new Producer();

        IProducer proxyProducer = (IProducer) Proxy.newProxyInstance(
                producer.getClass().getClassLoader(),
                producer.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * 作用：执行被代理对象的任何接口方法都会经过该方法
                     * 方法参数的含义
                     * @param proxy  代理对象的引用
                     * @param method 当前执行的方法
                     * @param args   当前执行方法所需的参数
                     * @return       和被代理对象方法有相同的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        Object result = null;

                        //1. 获取方法的执行参数
                        Float money =(Float) args[0];
                        //2.判断当前方法是不是销售
                        if ("saleProduct".equals(method.getName())) {
                            result = method.invoke(producer, money * 0.8f);
                        } else if ("afterService".equals(method.getName())) {
                            result = method.invoke(producer, money * 0.2f);
                        }
                        return  result;
                    }
                });

        //销售
        proxyProducer.saleProduct(10000f);
        //售后
        proxyProducer.afterService(10000f);
    }
}
