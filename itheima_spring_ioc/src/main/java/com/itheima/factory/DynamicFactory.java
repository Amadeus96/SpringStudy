package com.itheima.factory;


import com.itheima.dao.UserDao;
import com.itheima.dao.imp.UserDapImpl;

public class DynamicFactory {
    public  UserDao getUserDao(){
        return new UserDapImpl();
    }
}
