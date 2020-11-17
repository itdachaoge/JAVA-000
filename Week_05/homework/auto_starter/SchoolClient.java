package com.geek.spring.homework.auto_starter;

import com.geek.spring.homework.auto_starter.SchoolPorperties;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:
 */
public class SchoolClient {
    private SchoolPorperties schoolPorperties;

    public SchoolClient() {

    }

    public SchoolClient(SchoolPorperties s) {
        this.schoolPorperties = s;
    }

    public String getName() {
        return schoolPorperties.getSchoollist().toString();
    }
}
