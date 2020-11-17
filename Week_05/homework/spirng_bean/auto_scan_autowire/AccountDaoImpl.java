package com.geek.spring.homework.spirng_bean.auto_scan_autowire;

import org.springframework.stereotype.Component;

/**
 * @author: zhangycl
 * @date: 2020/11/16
 * @description:  账户的持久层实现类
 */
@Component("accountDao")
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户:auto_scan_autowire");
    }
}
