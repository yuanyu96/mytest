import org.junit.Test;
import singleton.Singleton;

/**
 * @author yuanyu
 * @title: TestSingleton
 * @description: TODO
 * @date 2021/8/31 15:50
 */
public class TestSingleton {
    @Test
    public void test1(){
        //构造方法私有 外部无法创建该类实例
        //singleton.Singleton singleton = new singleton.Singleton();

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        if(instance1==instance2){
            System.out.println("两个对象是相同的实例");
        }

    }
}
