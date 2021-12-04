package proxy.staticproxy;

/**
 * @author yuanyu
 * @title: StaticProxy
 * @description: 测试静态代理
 * @date 2021/9/1 10:21
 */
public class StaticProxy {
    public static void main(String[] args) {
        JayChou jayChou = new JayChou();
        StarProxy starProxy = new StarProxy(jayChou);
        starProxy.sing();
    }
}
