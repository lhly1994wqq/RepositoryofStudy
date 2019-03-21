package CollectionTest;

import java.util.*;

public class CollectionsTest {

    public void reverserun(){
        List<Hero> list = new ArrayList<>();

        for(int i = 0; i<10; i++ ){
            Hero hero = new Hero();
            hero.setId(i);
            hero.setName("hero-"+i);
            hero.setAge(i*5);
            list.add(hero);
        }

        list
                .stream()
                .forEach(h-> System.out.println(h.getName()));

        Hero array[] = list.toArray(new Hero[list.size()]);

        Arrays.stream(array)
                .forEach(h-> System.out.println(h.getName()));


//        System.out.println("dest中的数据顺序：");
//        System.out.println(dest);
//        System.out.println("src中的数据顺序：");
//        System.out.println(src);

        //反转操作
        //Collections.reverse(list);
//        Collections.shuffle(list);
//
//        System.out.println("混淆后的List中的数据顺序:");
//        System.out.println(list);
//
//        Collections.sort(list);

//        Collections.swap(list,1,6);

//        Collections.rotate(list,2);
      //  Collections.fill(list,8);

//        Collections.copy(dest,src);
//
//        System.out.println("替换后的dest中的数据顺序:");
//        System.out.println(dest);

    }

//    public static void main(String[] args){
//        CollectionsTest ct = new CollectionsTest();
//        ct.reverserun();
//    }
}
