package DesignPattern.WrapperPattern;

public class Sitter implements Human {

    //装饰对象
    private Human human;

    public Sitter(Human human){
        this.human = human;
    }

    @Override
    public void eat() {
        this.washHandForHuman();
        human.eat();
    }

    @Override
    public void run() {
        this.protectHuman();
        human.run();
    }

    public void washHandForHuman(){
        System.out.println("Wash hand");
    }

    public void protectHuman(){
        System.out.println("Protect baby");
    }
}
