package com.geek.spring.homework.singleton;

import java.io.Serializable;

/**
 * @author: zhang
 * @date: 2020/11/17
 * @description:
 */
public class Singleton implements Serializable {

    //1. 饿汉模式
/*    private static Singleton instance = new Singleton();
    private Singleton() {

    }
    public static Singleton getInstance() {
        return instance;
    }*/


    //2. 懒汉模式（线程不安全）
/*    private static Singleton instance;
    private Singleton() {

    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }*/


    //3. 懒汉模式（线程安全）
    /*private static Singleton instance;
    private Singleton() {

    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }*/

    //4. 双重检查模式（DCL）
   /* private volatile static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }*/


    //5. 静态内部类单例模式
    private Singleton() {

    }
    public static Singleton getInstance() {
        return SingletonHanlder.instance;
    }
    private static class SingletonHanlder {
        private static final Singleton instance = new Singleton();
    }

    private Object readResolve() {
        return SingletonHanlder.instance;
    }





}
