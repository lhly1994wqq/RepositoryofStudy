package DesignPattern.ProxyPattern.StaticProxyPattern;

public class GirlProxy implements Girl {

    private Girl girl;

    public GirlProxy(){
        girl = new GirlFriend();  //看到没, 女朋友自己跑到代理人手上了  你自己直接是见不到女朋友的
    }

    @Override
    public void beauty() {
        System.out.println("the proxy said:");
        girl.beauty();
    }
}
