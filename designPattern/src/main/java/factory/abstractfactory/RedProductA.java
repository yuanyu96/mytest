package factory.abstractfactory;

/**
 * @author yuanyu
 * @title: RedProductA
 * @description: 红色A产品生产类
 * @date 2021/8/31 18:42
 */
public class RedProductA extends ProductA {
    @Override
    public void show() {
        System.out.println("生产红色产品A");
    }
}
