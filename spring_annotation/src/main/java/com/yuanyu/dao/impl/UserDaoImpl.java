package com.yuanyu.dao.impl;

import com.yuanyu.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @author yuan'yu
 * @title: UserDaoImpl
 * @projectName spring
 * @description: TODO
 * @date 2021/4/715:38
 */
//<bean id="userDao" class="com.yuanyu.dao.impl.UserDaoImpl">
//<property name="name" value="袁煜"></property>
//</bean>
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Value("袁煜")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public UserDaoImpl(String name) {
        this.name = name;
    }

    public UserDaoImpl() {
    }

    public void save() {


        System.out.println(name+"save....");
    }
}
