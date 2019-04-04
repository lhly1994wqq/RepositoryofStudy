package DesignPattern;

import DesignPattern.FactoryPattern.Student;
import DesignPattern.FactoryPattern.StudentClient;

import DesignPattern.ProxyPattern.StaticProxyPattern.BabySitter;
import DesignPattern.ProxyPattern.StaticProxyPattern.Human;
import DesignPattern.WrapperPattern.Dresser;
import DesignPattern.WrapperPattern.Girl;
import DesignPattern.WrapperPattern.GirlFriend;
import DesignPattern.WrapperPattern.OtherDresser;
import org.junit.Test;

public class TestPart {

    @Test
    public void StaticFactoryTest(){
        Student s = new StudentClient().get("B");
        System.out.println(s.study());
    }

    @Test
    public void WrapperTest(){
        Girl girlfriend = new Dresser(new OtherDresser(new GirlFriend()));
        girlfriend.beauty();
    }

    @Test
    public void StaticProxyTest(){
        Human human = new BabySitter();    //代理模式看不到你代理的对象是谁
        human.eat();
    }
}
