package com.geek.spring.homework.auto_starter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:
 */
@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("/user/name")
    public String getUserName() {
        return userClient.getName();
    }
}
