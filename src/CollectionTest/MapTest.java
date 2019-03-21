package CollectionTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

    public void HashMaprun(){
        HashMap<Integer,String> hmap = new HashMap<>();

        //添加元素到HashMap中
        for (int i = 0; i < 10; i++) {
            hmap.put(i,"String"+i);
        }
        System.out.println(hmap);

        //通过key值删除元素
        String str = hmap.remove(3);
        System.out.println(str);

        //通过key值获取元素
        str = hmap.get(5);
        System.out.println(str);

        //通过添加已有的key来修改该key中的value
        hmap.put(2,"测试2");
        str = hmap.get(2);
        System.out.println(str);

        //通过keySet()方法得到key的集合，然后遍历keySet来遍历Value的集合
        Set<Integer> keyset = hmap.keySet();
        for(Integer i:keyset){
            String temp = hmap.get(i);
            System.out.print(temp+" -- ");
        }

        System.out.println("");

        //通过entrySet()得到Map的Entry集合，然后遍历
        Set<Map.Entry<Integer,String>> entries = hmap.entrySet();
        for(Map.Entry<Integer,String> entry:entries){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"<===>"+value);
        }
    }

//    public static void main(String[] args){
//        MapTest mt = new MapTest();
//        mt.HashMaprun();
//    }
}
