package DesignPattern.FactoryPattern;

//统一接口
//interface Student{ String study();}

//不同实现
class BeijingStudent implements Student{

    @Override
    public String study() {
        return "Beijing Student is studying";
    }
}

class TianjingStudent implements Student{

    @Override
    public String study() {
        return "Tianjing student is studying";
    }
}

class NanjingStudent implements Student{

    @Override
    public String study() {
        return "Nanjing student is studying";
    }
}

public class StaticFactory {

    public static Student getBstudent(){
        return new BeijingStudent();
    }
    public  static Student getTstudent(){
        return new TianjingStudent();
    }
    public static Student getNstudent(){
        return new NanjingStudent();
    }
}

