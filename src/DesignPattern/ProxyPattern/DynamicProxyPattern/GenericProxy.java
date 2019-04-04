package DesignPattern.ProxyPattern.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GenericProxy implements InvocationHandler {

    private Object proxyTarget; //声明一个代理目标

    public Object getProxyInstance(Object target){
        this.proxyTarget = target; //通过这个方法,将代理目标和代理关联
        //返回一个代理后的实例,这里的参数可以参考AOP文章中的说明
        return Proxy.newProxyInstance(proxyTarget.getClass().getClassLoader(),proxyTarget.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy do something");
        Object methodObject = method.invoke(proxyTarget,args);
        System.out.println("proxy end something");
        return methodObject;
    }
}
