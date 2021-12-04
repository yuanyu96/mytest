package proxy.cglibdynamicproxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yuanyu
 * @title: MyMethodInterceptor
 * @description: 实现MethodInterceptor接口的拦截器 方法请求会转发到intercept中做增强处理
 * @date 2021/9/1 11:32
 */
public class MyMethodInterceptor implements MethodInterceptor {
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("增强1");
        Object ob = methodProxy.invokeSuper(o,args);
        System.out.println("增强2");
        return  ob;

    }
}
