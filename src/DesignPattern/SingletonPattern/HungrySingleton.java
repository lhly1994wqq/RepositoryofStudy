package DesignPattern.SingletonPattern;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import org.omg.PortableInterceptor.INACTIVE;

public class HungrySingleton {

//    private final static HungrySingleton INSTANCE = new HungrySingleton();
//
//    private HungrySingleton(){}
//
//    public static HungrySingleton getInstance(){
//        return INSTANCE;
//    }

    //或者这样
    //饿汉式好处就是不用关心线程安全问题, 坏处就是,不管用不用得到这个单例,都会在类装载时实例化
    private static HungrySingleton INSTANCE;

    static {
        INSTANCE = new HungrySingleton();
    }

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }
}
