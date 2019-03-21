package AnnotationTest;

import java.lang.annotation.*;

//自定义一个可继承的注解
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Inheritable{
}

//应用注解
@Inheritable
class InheritableFather{
    public InheritableFather(){
        System.out.println("InheritableFather "+InheritableFather.class.isAnnotationPresent(Inheritable.class));
    }
}

//继承应用了注解的类
public class InheritedTest extends InheritableFather{

    public InheritedTest(){
        super();//调用父类构造函数
        //查看InheritedTest类是否具有Inheritable注解
        System.out.println("InheritedTest "+InheritedTest.class.isAnnotationPresent(Inheritable.class));
    }

}
