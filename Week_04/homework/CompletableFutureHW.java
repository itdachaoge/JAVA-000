package com.geek.current.homework;

import com.sun.javafx.image.IntPixelGetter;

import java.util.concurrent.*;

/**
 * @author: zhangycl
 * @date: 2020/11/11
 * @description:
 */
public class CompletableFutureHW {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        long start=System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法


        Integer result = CompletableFuture.supplyAsync(() -> { return sum();
        }).join();

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
