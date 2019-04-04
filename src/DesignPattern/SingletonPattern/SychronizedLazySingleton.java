package DesignPattern.SingletonPattern;

public class SychronizedLazySingleton {

    private static SychronizedLazySingleton INSTANCE;

    private SychronizedLazySingleton(){}

    //效率太低
    public static synchronized SychronizedLazySingleton getInstance(){
        if (INSTANCE == null)
            INSTANCE = new SychronizedLazySingleton();
        return INSTANCE;
    }
}
