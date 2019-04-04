package DesignPattern.ProxyPattern.CGlibPattern;

public class Child {
    //CGlib字节码增强不需要委托类实现接口
    public void eat(){
        System.out.println("child eat");
    }

    public void run(){
        System.out.println("child run");
    }

    public void breath(){
        System.out.println("child breath");
    }
}
