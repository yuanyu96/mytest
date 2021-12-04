package proxy.cglibdynamicproxy;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author yuanyu
 * @title: CglibDynamicProxy
 * @description: TODO
 * @date 2021/9/1 11:36
 */
public class CglibDynamicProxy {
    public static void main(String[] args) {
        //目标对象
        JayChou jayChou = new JayChou();
        //字节码增强器，可以方便的对你想要处理的类进行扩展
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(jayChou.getClass());
        //设置回调函数
        enhancer.setCallback(new MyMethodInterceptor());
        //创建代理对象
        JayChou myproxy = (JayChou)enhancer.create();
        //通过代理对象执行目标方法
        myproxy.sing();

//        通过CGLIB的Enhancer来指定要代理的目标对象、实际处理代理逻辑的对象，
//        最终通过调用create()方法得到代理对象，对这个对象所有非final方法的调用都会转发给MethodInterceptor.intercept()方法，
//        在intercept()方法里我们可以加入任何逻辑，比如修改方法参数，加入日志功能、安全检查功能等；通过调用MethodProxy.invokeSuper()方法，
//        我们将调用转发给原始对象
    }
}
