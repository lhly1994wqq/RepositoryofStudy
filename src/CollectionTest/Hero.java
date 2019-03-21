package CollectionTest;

import java.util.Comparator;
import java.util.Random;

public class Hero implements Comparable<Hero> {
    private String name;
    private int id;
    private int age;

    public Hero(){};
    public Hero(String name, int id, int age){
        this.name=name;
        this.id = id;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getId(){ return id;}
    public int getAge(){return age;}
    public void setName(String name){this.name=name;}
    public void setId(int id){this.id=id;}
    public void setAge(int age){this.age = age;}

    @Override
    public int compareTo(Hero o) {
        if(age<o.getAge())
            return -1;
        else
            return 1;
    }

    @Override
    public String toString(){
        return "[Name="+name+",Id="+id+",Age="+age+"]";
    }
}
