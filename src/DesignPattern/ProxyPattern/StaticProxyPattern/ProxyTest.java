package DesignPattern.ProxyPattern.StaticProxyPattern;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void test1(){
        Girl girlfriend = new GirlProxy(); //你没办法直接见你女朋友了, 你只能通过代理人见到
        girlfriend.beauty();
    }
}
