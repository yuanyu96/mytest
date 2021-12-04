package singleton;

/**
 * @author yuanyu
 * @title: singleton.Singleton
 * @description: 懒汉式-单例模式 （线程不安全的）
 * @date 2021/8/31 15:40
 */

//懒汉式单例   被引用时才会创建实例
public class Singleton {

    private static Singleton instance;

    /**
     *构造方法用 private修饰  避免外部类调用此构造方法 new 对象
     */
    private Singleton() {

    }
    /**
     *获得本类实例的唯一全局访问点
     */
    public static Singleton getInstance(){
       if(instance==null){
           instance = new Singleton();
       }
       return instance;
    }

}
