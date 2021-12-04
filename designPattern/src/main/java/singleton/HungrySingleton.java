package singleton;

/**
 * @author yuanyu
 * @title: singleton.HungrySingleton
 * @description: 饿汉式-单例模式 （线程安全的）
 * @date 2021/8/31 16:52
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private  HungrySingleton(){}
    /**
     * 在类一加载就实例化对象
     */
    private HungrySingleton getInstance(){
        return instance;
    }
}
