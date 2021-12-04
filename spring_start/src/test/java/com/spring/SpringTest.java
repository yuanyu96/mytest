package com.spring;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;
import java.util.concurrent.*;

/**
 * @author yuan'yu
 * @title: SpringTest
 * @projectName spring
 * @description: TODO
 * @date 2021/4/619:28
 */

public class SpringTest {
    @Test
    public void test_1(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) context.getBean("userDao");
        userDao.save();

        JSONObject object = new JSONObject();

        object.put("key","234");


        System.out.println(JSONObject.toJSONString(object));

        //手动调用关闭容器的方法，为了测试销毁方法
        context.close();
    }
    @Test
    public void test2() throws InterruptedException {

        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            strings.add(String.valueOf(i));
        }
        int length = strings.size();
        int num = 6; //初始线程数
        //启动多线程
        if(num > length){
            num = length;
        }
        CountDownLatch countDownLatch = new CountDownLatch(num);
        int baseNum = length / num;
        int remainderNum = length % num;
        int end  = 0;
        Date start1 = new Date();
        for (int i = 0; i < num; i++) {
            int start = end ;
            end = start + baseNum;
            if(i == (num-1)){
                end = length;
            }else if( i < remainderNum){
                end = end + 1;
            }
            MyThread myThread = new MyThread(strings, start, end,countDownLatch);
            new Thread(myThread, "线程" + i).start();
        }
        countDownLatch.await();
        Date end1 = new Date();
        System.out.println("多线程执行时间=="+(end1.getTime()-start1.getTime()));
//         Date start2 = new Date();
//
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("单线程处理："+strings.get(i));
//        }
//        Date end2 = new Date();
//        System.out.println("单线程执行时间=="+(end2.getTime()-start2.getTime()));


   }
   @Test
   public void test3() throws InterruptedException {
      ArrayList<String> strings = new ArrayList<String>();
       for (int i = 0; i < 10000; i++) {
           strings.add(String.valueOf(i));
       }

       ExecutorService executorService = new ThreadPoolExecutor(5, 8, 1, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(3), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
       //ExecutorService executorService = Executors.newFixedThreadPool(4);


       int num = 3; //初始线程数


       CountDownLatch countDownLatch = new CountDownLatch(num);

       Date startTime = new Date();

           Worker worker1 = new Worker(strings,countDownLatch,0,3333);
           Worker worker2 = new Worker(strings,countDownLatch,3333,6666);
           Worker worker3 = new Worker(strings,countDownLatch,6666,9999);
          // Worker worker1 = new Worker(strings,countDownLatch,0,9999);


           executorService.submit(worker1);
           executorService.submit(worker2);
           executorService.submit(worker3);

       countDownLatch.await();
       Date endTime = new Date();

       System.out.println("多线程执行时间=="+(endTime.getTime()-startTime.getTime()));
    }
}
