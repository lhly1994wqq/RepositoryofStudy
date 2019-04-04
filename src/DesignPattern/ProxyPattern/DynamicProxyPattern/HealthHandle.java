package DesignPattern.ProxyPattern.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HealthHandle implements InvocationHandler
{
    private Object proxyTarget;

    public Object getProxyInstance(Object target){
        this.proxyTarget = target;
        return Proxy.newProxyInstance(proxyTarget.getClass().getClassLoader(),proxyTarget.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy help wash hand start");
        Object methodObject  = method.invoke(proxyTarget,args);
        System.out.println("proxy help wash hand over");
        return methodObject;
    }
}
