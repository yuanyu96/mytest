package factory.abstractfactory;

/**
 * @author yuanyu
 * @title: RedProductFactory
 * @description: TODO
 * @date 2021/8/31 19:36
 */
public class BlueProductFactory implements LevelFactory {


    public ProductA getA() {
        return new BlueProductA();
    }

    public ProductB getB() {
        return new BlueProductB();
    }
}
