package DesignPattern.ProxyPattern.CGlibPattern;

import org.junit.Test;

public class CGlibTest {

    @Test
    public void test1(){
        HealthHandle hh = new HealthHandle();
        Child child = (Child)hh.getProxyInstance(new Child());
        child.eat();
        child.breath();
    }

    @Test
    public void test2(){
        HealthHandle hh = new HealthHandle();
        PeoPle p = (PeoPle)hh.getProxyInstance(new PeoPle());
        p.play();
    }

    @Test
    public void test3(){
//        GirlProxy gp = new GirlProxy();
//        HealthHandle hh = new HealthHandle();
//        Child child = (Child) hh.getProxyInstance(gp.getProxyInstance( new Child()));
//        child.breath();
//        child.eat();
//        child.run();
    }
}
