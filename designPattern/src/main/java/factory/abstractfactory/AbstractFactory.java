package factory.abstractfactory;

/**
 * @author yuanyu
 * @title: AbstractFactory
 * @description: TODO
 * @date 2021/8/31 19:41
 */
public class AbstractFactory {
    public static void main(String[] args) {
        //生产红色产品
        RedProductFactory redProductFactory = new RedProductFactory();
        //红色A产品
        redProductFactory.getA().show();
        //红色B产品
        redProductFactory.getB().show();
        //生产蓝色产品
        BlueProductFactory blueProductFactory = new BlueProductFactory();
        //蓝色A产品
        blueProductFactory.getA().show();
        //蓝色B产品
        blueProductFactory.getB().show();

        //生产其他颜色的产品 只需要新建一个其他颜色的工厂即可 不用改动原代码结构
        //但想生产C产品 就需要改原来代码结构了
        //由此可见 抽象工厂模式  扩充族容易 扩充等级繁琐



    }
}
