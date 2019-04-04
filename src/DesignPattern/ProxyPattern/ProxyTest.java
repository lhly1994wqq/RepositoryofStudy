package DesignPattern.ProxyPattern;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void test1(){
        HealthHandle hh = new HealthHandle();
        Human human = (Human)hh.getProxyInstance(new Baby());
        human.eat();
    }
}
