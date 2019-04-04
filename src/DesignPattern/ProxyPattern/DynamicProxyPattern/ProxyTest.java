package DesignPattern.ProxyPattern.DynamicProxyPattern;

import DesignPattern.ProxyPattern.DynamicProxyPattern.Baby;
import DesignPattern.ProxyPattern.DynamicProxyPattern.HealthHandle;
import DesignPattern.ProxyPattern.DynamicProxyPattern.Human;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void test1(){
        Girl girlfriend = new GirlFriend();
        GenericProxy gp = new GenericProxy();
        Girl girlFriend = (Girl) gp.getProxyInstance(girlfriend);
        girlFriend.beauty();
    }
}
