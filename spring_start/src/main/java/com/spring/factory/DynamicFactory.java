package com.spring.factory;

import com.spring.UserDao;
import com.spring.impl.UserDaoImpl;

/**
 * @author yuan'yu
 * @title: DynamicFactory
 * @projectName spring
 * @description: TODO
 * @date 2021/4/620:15
 */
public class DynamicFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl("使用工厂实例方法实例化Bean");
    }
}
