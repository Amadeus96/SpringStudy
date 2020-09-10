package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void  save(){
        System.out.println("running");
        System.out.println("已经启动了");
    }
}
