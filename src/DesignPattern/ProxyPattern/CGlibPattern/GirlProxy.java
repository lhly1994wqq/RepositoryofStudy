package DesignPattern.ProxyPattern.CGlibPattern;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class GirlProxy implements MethodInterceptor {

    private Object proxyTarget;

    public Object getProxyInstance(Object target){
        this.proxyTarget = target;
        return Enhancer.create(target.getClass(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        Object methodResult = null;

        if(method.getName().equals("beauty")){
            System.out.println("proxy do something");
            methodResult = method.invoke(proxyTarget,args); //启动委托类方法的第一种
            System.out.println("proxy do something end");
        } else {
            System.out.println("proxy dont wanna do something");
          methodProxy.invokeSuper(proxy,args);  //启动委托类方法的第二种
        }

        return methodResult;
    }
}
