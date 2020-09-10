package com.itheima.dao.imp;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl(){
        System.out.println("UserDaoIml创建");
    }
    public void init(){
        System.out.println("初始化");
    }
    public void destroy(){
        System.out.println("销毁");
    }
    public void save(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("save running...");
    }
}
