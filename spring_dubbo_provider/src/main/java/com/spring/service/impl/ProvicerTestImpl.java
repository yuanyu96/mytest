package com.spring.service.impl;

import com.spring.service.inter.ProviderTest;

/**
 * @author yuanyu
 * @title: ProvicerTestImpl
 * @description: TODO
 * @date 2021/5/14 17:04
 */
public class ProvicerTestImpl implements ProviderTest {
    public String test1(String s) {
        System.out.println("s="+s);
        return "调用test1成功"+s;
    }

    public ProvicerTestImpl() {
        super();
    }

    public void test2(String s) {
        System.out.println("调用test2成功"+s);

    }

    public void test3() {
        System.out.println("调用test3成功");
    }
}
