package com.spring.factory;

import com.spring.UserDao;
import com.spring.impl.UserDaoImpl;

/**
 * @author yuan'yu
 * @title: StaticFactory
 * @projectName spring
 * @description: TODO
 * @date 2021/4/620:07
 */
//工厂静态方法实例化Bean
public class StaticFactory {

    public static UserDao getUserDao(){

        return new UserDaoImpl("使用静态工厂实例化Bean");
    }
}
