package com.geek.spring.homework.jdbc_dbpool.tx_hikaripool.dao;

import com.geek.spring.homework.jdbc_dbpool.tx_hikaripool.Account;

/**
 * @author: zhangycl
 * @date: 2020/11/17
 * @description:  账户的持久层接口
 */
public interface IAccountDao {

    /**
     * 根据名称查询账户
     * @param accountName
     * @return
     */
    Account findAccountByName(String accountName);

    /**
     * 更新账户
     * @param account
     */
    void updateAccount(Account account);
}
