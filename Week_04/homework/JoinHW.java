package com.geek.current.homework;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: zhangycl
 * @date: 2020/11/11
 * @description:
 */
public class JoinHW {

    public static void main(String[] args) throws InterruptedException {

        long start=System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        // 异步执行下面方法

        AtomicInteger result = new AtomicInteger();
        Thread thread = new Thread(() -> {
            result.set(sum()); //这是得到的返回值
        });

        //设置等待的超时时间
        thread.join(1000);

        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);

        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        // 然后退出main线程
    }

    private static int sum() {
        return fibo(36);
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
