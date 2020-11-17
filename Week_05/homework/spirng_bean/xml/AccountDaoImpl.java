package com.geek.spring.homework.spirng_bean.xml;

import com.geek.spring.homework.spirng_bean.xml.IAccountDao;

/**
 * @author: zhangycl
 * @date: 2020/11/16
 * @description:  账户的持久层实现类
 */
public class AccountDaoImpl implements IAccountDao {
    @Override
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
