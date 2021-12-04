package factory.factorymethod;

import factory.factorymethod.FactoryA;
import factory.factorymethod.FactoryB;

/**
 * @author yuanyu
 * @title: factory.factorymethod.FactoryMethod
 * @description: 工厂方法模式
 * @date 2021/8/31 17:19
 */
public class FactoryMethod {
    public static void main(String[] args) {
        //客户想要A产品
        FactoryA factoryA = new FactoryA();
        factoryA.manufacture().show();

        //客户想要B产品
        FactoryB factoryB = new FactoryB();
        factoryB.manufacture().show();
    }

}
