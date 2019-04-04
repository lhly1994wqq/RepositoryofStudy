package DesignPattern.WrapperPattern;

public class OtherDresser implements Girl {

    private Girl girl;

    public OtherDresser(Girl girl){
        this.girl = girl;
    }

    @Override
    public void beauty() {
        System.out.println("Dress your girl too");
        girl.beauty();
    }
}
