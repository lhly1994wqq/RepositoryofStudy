package DesignPattern.FactoryPattern;

public class StudentClient{
    public Student get(String name){
        if (name.equals("B"))
            return StaticFactory.getBstudent();
        else if(name.equals("T"))
            return StaticFactory.getTstudent();
        else
            return StaticFactory.getNstudent();
    }
}