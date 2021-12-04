package com.spring.impl;

import com.spring.UserDao;

/**
 * @author yuan'yu
 * @title: UserDaoImpl
 * @projectName spring
 * @description: TODO
 * @date 2021/4/616:36
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("使用无参构造创建bean");
    }
    public UserDaoImpl(String s) {
        System.out.println(s);
    }

    //方法名字随便起
    public void init(){
        System.out.println("测试spring生命周期：执行初始化方法");
    }
    public void destroy(){
        System.out.println("测试spring生命周期：执行销毁方法");
    }


    public void save() {

        System.out.println("save。。。。");
    }
}
