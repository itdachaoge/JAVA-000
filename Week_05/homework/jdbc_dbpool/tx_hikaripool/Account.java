package com.geek.spring.homework.jdbc_dbpool.tx_hikaripool;

import lombok.Data;
import lombok.ToString;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:
 */
@Data
@ToString
public class Account {

    private Integer id;
    private String name;
    private Float money;
}
