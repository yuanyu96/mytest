package factory.factorymethod;

import factory.factorymethod.Product;

/**
 * @author yuanyu
 * @title: FactoryA
 * @description: 具体工厂A 只生产A产品
 * @date 2021/8/31 17:45
 */
public class FactoryA extends Factory {
    @Override
    public Product manufacture() {

        return new ProductA();
    }
}
