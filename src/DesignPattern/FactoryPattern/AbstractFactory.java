package DesignPattern.FactoryPattern;

class FactoryForBS implements StudentFactory{

    @Override
    public Student get() {
        return new BeijingStudent();
    }
}

class FactoryForTS implements StudentFactory{

    @Override
    public Student get() {
        return new TianjingStudent();
    }
}

class FactoryForNS implements StudentFactory{

    @Override
    public Student get() {
        return new NanjingStudent();
    }
}

public class AbstractFactory {
    Student a = new FactoryForBS().get();
    Student b = new FactoryForNS().get();
}
