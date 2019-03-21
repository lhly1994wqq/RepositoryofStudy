package CollectionTest;

import java.util.ArrayList;

class Dog{ }

class Human{
    private static long counter;
    private final long id = counter++;
    public long id(){return id;}
}

public class TypeSafeTest {
    public void run(){
        ArrayList humans = new ArrayList();//无规定类型的容器
        for(int i = 0; i<3; i++){
            humans.add(new Human());
        }
        //向人的容器中加入一只狗
        humans.add(new Dog());

        for(int i = 0; i<humans.size(); i++){
            ((Human)humans.get(i)).id();
            //由于容器中默认为保存Object类，再取出时要强制转型为Human类，并获取容器中每个人的ID
        }
    }
}
