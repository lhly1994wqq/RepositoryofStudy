package DesignPattern.WrapperPattern;

public class Baby implements Human{
    @Override
    public void eat() {
        System.out.println("Baby eat");
    }

    @Override
    public void run() {
        System.out.println("Baby run");
    }
}
