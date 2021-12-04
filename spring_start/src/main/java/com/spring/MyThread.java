package com.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * @author yuanyu
 * @title: MyThread
 * @description: TODO
 * @date 2021/9/7 20:20
 */
public class MyThread implements Runnable {
    private ArrayList<String> array;
    private int startIndex;
    private int endIndex;
    private CountDownLatch countDownLatch;

    public MyThread(ArrayList<String> array, int startIndex, int endIndex,CountDownLatch countDownLatch) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.countDownLatch = countDownLatch;
    }

    public ArrayList<String> getArray() {
        return array;
    }

    public void setArray(ArrayList<String> array) {
        this.array = array;
    }
    @Override
    public void run() {


        for (String s: array) {
            System.out.println(Thread.currentThread().getName()+"处理:"+s);

        }
        countDownLatch.countDown();

    }
}
