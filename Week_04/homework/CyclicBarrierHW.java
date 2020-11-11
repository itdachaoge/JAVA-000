package com.geek.current.homework;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author: zhangycl
 * @date: 2020/11/11
 * @description:
 */
public class CyclicBarrierHW {
    static CyclicBarrier cyclicBarrier = new CyclicBarrier(1);
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {

        long start=System.currentTimeMillis();
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法

        int result = sum(); //这是得到的返回值

        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);

        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

        // 然后退出main线程
    }

    private static int sum() throws BrokenBarrierException, InterruptedException {
        cyclicBarrier.await();
        int result = fibo(36);
        return result;
    }

    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
