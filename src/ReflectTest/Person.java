package ReflectTest;

public class Person {

    private String name;
    private int id;
    public int age;

    static {
        System.out.println("初始化Person类");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void run(){
        System.out.println(name+" is Running");
    }

    private void feel(String f){
        System.out.println(name+" is Felling "+f);
    }

    @Override
    public String toString(){
        return "[Name="+name+",Id="+id+",Age="+age+"]";
    }
}
