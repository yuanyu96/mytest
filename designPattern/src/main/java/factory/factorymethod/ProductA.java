package factory.factorymethod;

/**
 * @author yuanyu
 * @title: ProductA
 * @description: 具体产品类 值生产A产品
 * @date 2021/8/31 17:43
 */
public class ProductA extends Product {
    @Override
    public void show() {
        System.out.println("生产A产品");
    }
}
