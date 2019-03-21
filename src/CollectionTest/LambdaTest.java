package CollectionTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LambdaTest {

//    public void run1(){
//        Random r = new Random(System.currentTimeMillis());
//        List<Hero> list = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            list.add(new Hero("hero-"+i,r.nextInt(500),r.nextInt(100)));
//        }
//
//        //用filter筛选满足条件的对象，并进行操作
//        list
//                .stream()
//                .filter(h-> h.getId()<300 && h.getAge()>50)
//                .forEach(h-> System.out.println(h));
//
//        //用distinct去除重复元素
//        list
//                .stream()
//                .distinct()
//                .forEach(h-> System.out.print(h));
//
//        //用sorted进行排序
//        list
//                .stream()
//                .sorted((h1,h2) -> h1.getAge()>h2.getAge() ? 1:-1)
//                .forEach(h-> System.out.println(h));
//
//        //用limit保留三个元素
//        list
//                .stream()
//                .limit(3)
//                .forEach(h-> System.out.println(h));
//
//        //用skip忽略前三个元素
//        list
//                .stream()
//                .skip(3)
//                .forEach(h-> System.out.println(h));
//
//        //用mapToDouble转换为Double的Stream
//        list
//                .stream()
//                .mapToDouble(Hero::getAge)
//                .forEach(h-> System.out.println(h));
//
//        //转换为任意类型的Stream
//        list
//                .stream()
//                .map((h)-> h.getName()+"-"+h.getAge()+"-"+h.getId())
//                .forEach(h-> System.out.println(h));
//
//        //用forEach遍历集合
//        list
//                .stream()
//                .forEach(h-> System.out.println(h));
//
//        //用toArray将表变为数组
//        Object[] arrays = list
//                .stream()
//                .toArray();
//
//        //用min得到最小值
//        Hero h1 = list
//                .stream()
//                .min((hf,hs)->hf.getAge()-hs.getAge())
//                .get();
//
//        //用max得到最大值
//        Hero h2 =list
//                .stream()
//                .max((hf,hs) -> hf.getAge()-hs.getAge())
//                .get();
//
//        //用count计算流中的数据总数
//        long count = list
//                .stream()
//                .count();
//
//        //用findFirst得到第一个元素
//        Hero h3 = list
//                .stream()
//                .findFirst()
//                .get();
//    }
//
    public void run2(){
        Random r = new Random(System.currentTimeMillis());
        List<Hero> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Hero("hero-"+i,r.nextInt(500),r.nextInt(100)));
        }


        System.out.println("当前列表：");
        System.out.println(list);
        //聚合操作
        Hero h = list
                .stream()
                .sorted((h1,h2)-> h1.getAge()>h2.getAge() ? -1:1)
                .skip(2)
                .findFirst()
                .get();
        System.out.println("年龄第三大的Hero");
        System.out.println(h);

    }

//    public static void main(String[] agrs){
//        LambdaTest lt = new LambdaTest();
//        lt.run2();
//    }
}
