package DesignPattern.ProxyPattern.CGlibPattern;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HealthHandle implements MethodInterceptor {

    //基于子类的动态代理,其实现的接口是方法拦截器
    //基于接口的动态代理,其实现的接口是InvocationHandler
    private Object proxyTarget;

    public Object getProxyInstance(Object target){
        this.proxyTarget = target;
        return Enhancer.create(target.getClass(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        Object methodResult = null;
        if(method.getName().equals("eat")){
            System.out.println("wash hand before eat");
            //methodResult = method.invoke(proxyTarget,args);
            methodProxy.invokeSuper(proxy,args);
            System.out.println("wash hand after eat");
        }
        else {
            System.out.println("someone gonna do something");
            methodResult = method.invoke(proxyTarget,args);
        }
        return methodResult;
    }
}
