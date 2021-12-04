package com.spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author yuanyu
 * @title: Worker
 * @description: TODO
 * @date 2021/9/14 16:09
 */
public class Worker implements Runnable{
    private int start;
    private int end;
    private ArrayList<String> array;
    private CountDownLatch countDownLatch;

    public Worker(ArrayList<String> array, CountDownLatch countDownLatch,int start,int end) {
        this.array = array;
        this.countDownLatch = countDownLatch;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {

        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        readWriteLock.readLock().lock();
        try{
            try {
                Thread.sleep(end-start);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i=start;i<end;i++){
                System.out.println(Thread.currentThread().getName()+"处理: "+array.get(i));
            }

        }finally {
            readWriteLock.readLock().unlock();
            countDownLatch.countDown();

        }

    }
}
