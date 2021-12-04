package com.yuanyu;

import com.yuanyu.dao.UserDao;
import com.yuanyu.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yuan'yu
 * @title: Test
 * @projectName spring
 * @description: TODO
 * @date 2021/4/715:44
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;
    @org.junit.Test
    public void UserDaoTest(){
        userDao.save();
    }
    @org.junit.Test
    public void UserServiceTest(){
        userService.save();

    }

}
