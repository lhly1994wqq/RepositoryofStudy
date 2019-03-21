package AnnotationTest;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    MetaAnnotation metadata() default @MetaAnnotation("Wrong");
}

@MyAnnotation()
class MyUse{
    MyAnnotation ma = MyUse.class.getAnnotation(MyAnnotation.class);
    MetaAnnotation md = ma.metadata();
    String value = md.value();

    public void run(){
        System.out.println(value);
    }
}