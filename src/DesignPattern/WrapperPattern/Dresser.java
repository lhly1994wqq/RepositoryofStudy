package DesignPattern.WrapperPattern;

public class Dresser implements Girl {

    private Girl customer;  //每个化妆师都有一个顾客

    public Dresser(Girl customer){  //顾客进店了
        this.customer = customer;
    }

    @Override
    public void beauty() {
        System.out.println("Dress girl");
        customer.beauty();
    }

}
