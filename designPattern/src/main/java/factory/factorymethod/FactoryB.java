package factory.factorymethod;

import factory.factorymethod.Product;

/**
 * @author yuanyu
 * @title: FactoryB
 * @description: 具体工厂B 只生产B产品
 * @date 2021/8/31 17:46
 */
public class FactoryB extends Factory {
    @Override
    public Product manufacture() {
        return new ProductB();
    }
}
