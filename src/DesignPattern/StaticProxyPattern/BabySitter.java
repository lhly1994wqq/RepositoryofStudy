package DesignPattern.StaticProxyPattern;

public class BabySitter implements Human {
    private Baby baby;

    public BabySitter(){
        this.baby = new Baby();
    }

    @Override
    public void eat() {
        this.washhand();
        baby.eat();
    }

    public void washhand(){
        System.out.println("wash baby's hands");
    }
}
