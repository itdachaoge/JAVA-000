package com.geek.spring.homework.auto_starter;

import com.geek.spring.homework.auto_starter.user.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:
 */
@RestController
public class SchoolController {

    @Autowired
    private SchoolClient schoolClient;

    @GetMapping("/school/name")
    public String getUserName() {
        return schoolClient.getName();    //School(klasses=[Klass(students=[Student(id=1, name=zhangycl), Student(id=2, name=zhangycl2)])])
    }
}
