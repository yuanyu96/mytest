package factory.factorymethod;

/**
 * @author yuanyu
 * @title: ProductB
 * @description: 具体产品类B 只生产产品B
 * @date 2021/8/31 17:43
 */
public class ProductB extends Product {
    @Override
    public void show() {
        System.out.println("生产B产品");
    }
}
