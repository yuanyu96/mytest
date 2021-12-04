package com.yuanyu.service.impl;

import com.yuanyu.dao.UserDao;
import com.yuanyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yuan'yu
 * @title: UserServiceImpl
 * @projectName spring
 * @description: TODO
 * @date 2021/4/715:53
 */
//<bean id="userService" class="com.yuanyu.service.impl.UserServiceImpl">
//<property name="userDao" ref="userDao"></property>
//</bean>

@Service("userService")
public class UserServiceImpl implements UserService {

@Autowired//按照类型装配，当容器中只有一个该类型的对象时，可以直接使用
//@Qualifier("userDao")//按照id值从Spring容器取对象注入，一旦使用必须和Autowired注解联合用
    //@Resource(name="userDao")//相当于@Autowired和@Qualifier注解的合体
    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();

    }
}
