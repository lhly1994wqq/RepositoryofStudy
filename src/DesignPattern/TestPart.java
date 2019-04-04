package DesignPattern;

import DesignPattern.BuilderPattern.Book;
import DesignPattern.FactoryPattern.Student;
import DesignPattern.FactoryPattern.StudentClient;

import DesignPattern.StaticProxyPattern.BabySitter;
import DesignPattern.WrapperPattern.Baby;
import DesignPattern.StaticProxyPattern.Human;
import DesignPattern.WrapperPattern.Sitter;
import org.junit.Test;

public class TestPart {

    @Test
    public void StaticFactoryTest(){
        Student s = new StudentClient().get("B");
        System.out.println(s.study());
    }

    @Test
    public void WrapperTest(){
//        Human human = new Sitter(new Baby());  //装饰模式可以看到你装饰之前的对象
//        human.run();
//        human.eat();
    }

    @Test
    public void StaticProxyTest(){
        Human human = new BabySitter();    //代理模式看不到你代理的对象是谁
        human.eat();
    }
}
