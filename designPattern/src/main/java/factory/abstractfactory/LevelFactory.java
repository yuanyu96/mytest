package factory.abstractfactory;

/**
 * @author yuanyu
 * @title: LevelFactory
 * @description: 等级抽象工厂接口
 * @date 2021/8/31 18:58
 */
public interface LevelFactory {
    ProductA getA();
    ProductB getB();
}
