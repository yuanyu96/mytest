package factory.abstractfactory;

/**
 * @author yuanyu
 * @title: RedProductFactory
 * @description: TODO
 * @date 2021/8/31 19:36
 */
public class RedProductFactory implements LevelFactory {


    public ProductA getA() {
        return new RedProductA();
    }

    public ProductB getB() {
        return new RedProductB();
    }
}
