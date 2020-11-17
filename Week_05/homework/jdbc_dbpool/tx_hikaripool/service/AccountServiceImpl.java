package com.geek.spring.homework.jdbc_dbpool.tx_hikaripool.service;

import com.geek.spring.homework.jdbc_dbpool.tx_hikaripool.Account;
import com.geek.spring.homework.jdbc_dbpool.tx_hikaripool.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: zhang
 * @date: 2020/11/17
 * @description:
 */
@Service("accountService")
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true) //只读型事务的配置
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    //需要的是读写型事务配置
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    @Override
    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("transfer....");
        //1. 根据名称查询转出账户
        Account source = accountDao.findAccountByName(sourceName);
        //2. 根据名称查询转入账户
        Account target = accountDao.findAccountByName(targetName);
        //3. 转出账户减钱
        source.setMoney(source.getMoney()-money);
        //4. 转入账户加钱
        target.setMoney(target.getMoney()+money);
        //5. 更新转出账户
        accountDao.updateAccount(source);

//            int i=1/0; //出现异常则回滚

        //6. 更新转入账户
        accountDao.updateAccount(target);
    }
}
