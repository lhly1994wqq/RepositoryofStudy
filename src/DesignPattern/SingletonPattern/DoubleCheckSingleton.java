package DesignPattern.SingletonPattern;

public class DoubleCheckSingleton {

    private static DoubleCheckSingleton INSTANCE;

    private DoubleCheckSingleton(){}

    //双重检查就是优化了同步懒汉式的代码, 增加了效率, 又保证了线程安全
    public static DoubleCheckSingleton getInstance(){
        if (INSTANCE == null){
            synchronized (DoubleCheckSingleton.class){
                if (INSTANCE == null)
                    INSTANCE = new DoubleCheckSingleton();
            }
        }
        return INSTANCE;
    }
}
