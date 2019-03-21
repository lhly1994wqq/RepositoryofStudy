package AnnotationTest;

public class Person {

    String name;

    @SafeVarargs
    public static <T> T getOne(T... elements){
        return elements.length>0? elements[0]:null;
    }
}
