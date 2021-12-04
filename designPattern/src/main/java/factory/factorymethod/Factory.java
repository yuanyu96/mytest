package factory.factorymethod;

import factory.factorymethod.Product;

/**
 * @author yuanyu
 * @title: Factory
 * @description: 抽象工厂类
 * @date 2021/8/31 17:35
 */
abstract class Factory {
    public abstract Product manufacture();
}
