package proxy.jdkdynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yuanyu
 * @title: MyHandler
 * @description: TODO
 * @date 2021/9/1 11:00
 */
public class MyHandler implements InvocationHandler {

    private Object ob;

    public MyHandler(Object ob) {
        this.ob = ob;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StrengthenUtil.method1();
        method.invoke(ob,args);
        StrengthenUtil.method2();
        return null;
    }
}
