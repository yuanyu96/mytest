package com.spring.impl;

import com.spring.UserDao;
import com.spring.UserService;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author yuan'yu
 * @title: UserServiceImpl
 * @projectName spring
 * @description: TODO
 * @date 2021/4/621:14
 */
public class UserServiceImpl implements UserService, InitializingBean {
    private UserDao userDao;
    //测试 实现InitializingBean接口 afterPropertiesSet（）方法给init变量赋值
    private String init;

    public UserServiceImpl() {
    }
   //Spring也可以通过此有参构造函数注入对象
    public UserServiceImpl(UserDao userDao,String init) {
        this.userDao = userDao;
        this.init=init;
        System.out.println("有参构造函数注入UserDao");
    }

    //Spring利用此set方法依赖注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("set注入UserDao");
    }

    public String getInit() {
        return init;
    }

    public void setInit(String init) {
        this.init = init;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        init="初始化init参数成功";
    }
    @Override
    public void save() {
        userDao.save();
        System.out.println(getInit());

    }
}
