package DesignPattern.SingletonPattern;

public class Singleton {

    private Singleton(){}

    //静态内部类的方式是最高效的方式
    //由于静态内部类不会在上层类被装载时也被装载,只有在用到它时才会装载
    //所以起到了懒汉式的lazy-loading的作用
    //同时保证了线程安全
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
