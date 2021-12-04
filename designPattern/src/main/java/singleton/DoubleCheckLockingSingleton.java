package singleton;

/**
 * @author yuanyu
 * @title: singleton.DoubleCheckLockingSingleton
 * @description: 懒汉式-双重检查锁-单例模式  （适用于多线程情况下 保证了线程安全性）
 * @date 2021/8/31 16:18
 */

public class DoubleCheckLockingSingleton {
    private static DoubleCheckLockingSingleton instance;
    /**
     *辅助的锁对象
     */
    private static String syncLock = new String();
    /**
     *构造函数私有化
     */
    private DoubleCheckLockingSingleton(){}
    private static DoubleCheckLockingSingleton getInstance(){
        //不让线程每次访问都加锁  只是当对象实例不存在时才加锁
        if(instance == null){
           synchronized(syncLock){
               //如果不设第二重检查 那么锁外面等待的线程获得进入锁之后会再创建一个实例
               if(instance == null){
                   instance = new  DoubleCheckLockingSingleton();
               }
           }

            }
        return instance;
        }

    }

