package DesignPattern.SingletonPattern;

public class LazySingleton {

    private static LazySingleton INSTANCE;

    private LazySingleton(){}

    //线程不安全
    public static LazySingleton getInstance(){
        if (INSTANCE == null)
            INSTANCE = new LazySingleton();
        return INSTANCE;
    }
}
