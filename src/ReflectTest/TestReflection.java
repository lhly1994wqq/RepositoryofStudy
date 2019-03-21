package ReflectTest;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.*;
import java.util.Properties;

interface fruit{
    public abstract void eat();
}

class Apple implements fruit{

    @Override
    public void eat() {
        System.out.println("eat Apple");
    }
}

class Orange implements fruit{

    @Override
    public void eat() {
        System.out.println("eat Orange");
    }
}

class Factory{
    public static fruit getInstance(String fname){
        fruit f = null;
        try{
            f=(fruit)Class.forName(fname).newInstance();
        }catch (ClassNotFoundException | InstantiationException | IllegalAccessException e){
            e.printStackTrace();
        }
        return f;
    }
}

public class TestReflection {

//    public static void main(String[] args){
//
//        try{
//            //从保存类名称和方法名称的文件中获取信息
//            File configfile = new File("D:\\IDEAworkspace\\JavaBasick\\methodtxt.txt");
//            Properties config = new Properties();
//            config.load(new FileInputStream(configfile));
//            String className = (String)config.get("class");
//            String methodName = (String)config.get("method");
//
//            //根据类名称获取类对象
//            Class dclass = Class.forName(className);
//            //根据方法名称获取方法
//            Method method = dclass.getMethod(methodName);
//            //获取构造器
//            Constructor c = dclass.getConstructor();
//            //实例化
//            Object dosomething = c.newInstance();
//            //调用指定方法
//            method.invoke(dosomething);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
}
