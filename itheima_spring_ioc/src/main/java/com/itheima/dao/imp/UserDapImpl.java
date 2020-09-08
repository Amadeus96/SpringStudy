package com.itheima.dao.imp;

import com.itheima.dao.UserDao;

public class UserDapImpl implements UserDao {
    public UserDapImpl(){
        System.out.println("UserDaoIml创建");
    }
    public void save(){
        System.out.println("save running...");
    }
}
