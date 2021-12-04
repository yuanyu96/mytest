package proxy.jdkdynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author yuanyu
 * @title: JdkDynamicProxy
 * @description: JDK动态代理测试
 * @date 2021/9/1 10:41
 */
public class JdkDynamicProxy {
    public static void main(String[] args) {
        JayChou jayChou = new JayChou();
        //传入目标对象到自定义的handler对象里
        MyHandler myHandler = new MyHandler(jayChou);
        //反射动态生成代理对象
        IStar myProxy = (IStar)Proxy.newProxyInstance(jayChou.getClass().getClassLoader(),
                jayChou.getClass().getInterfaces(), myHandler);
        //代理对象代替执行目标对象的方法并对目标方法增强
        myProxy.sing();
    }
}
