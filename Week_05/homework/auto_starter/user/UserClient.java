package com.geek.spring.homework.auto_starter.user;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:
 */
public class UserClient {
    private UserPorperties userPorperties;

    public UserClient() {

    }

    public UserClient(UserPorperties p) {
        this.userPorperties = p;
    }

    public String getName() {
        return userPorperties.getName();
    }
}
