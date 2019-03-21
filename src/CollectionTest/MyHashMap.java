package CollectionTest;

import java.util.*;

public class MyHashMap {

    //初始化对象数组，用于保存存储键值对的链表
    private LinkedList<Entry>[] lArray = new LinkedList[2000];

    //--------------------------------------------------

    public static int hashcode(String str){
        int hcode = 0;
        for (int i = 0; i < str.length(); i++) {
            hcode = hcode + str.charAt(i)*(str.length()-1);
        }
        return hcode = hcode%2000;
    }

    //---------------------------------------------------------------------
    public void put(String key,Object value){
        //获取键的哈希值
        int hcode = hashcode(key);
        //判断该哈希值对应的存储位置是否有存储
        LinkedList<Entry> ll = lArray[hcode];
        if(null == ll){
            //新建一个链表存储在该位置，并将键值对保存在链表中
            ll = new LinkedList<>();
            lArray[hcode] = ll;
        }
        //判断该key是否已经有对应的键值对
        boolean found = false;
        for(Entry entry:ll){
            if(key.equals(entry.getKey())){
                entry.setValue(value);
                found = true;
                break;
            }
        }
        if(!found){
            Entry entry = new Entry(key,value);
            ll.add(entry);
        }
    }

    //--------------------------------------------------------------------------
    public Object get(String key){
        //获取key的哈希值
        int hcode = hashcode(key);
        LinkedList<Entry> ll = lArray[hcode];
        if(null == ll){
            return null;
        }else{
            for (Entry e:ll){
                if(key.equals(e.getKey()))
                    return e.getValue();
            }
            return null;
        }
    }

//    public static void main(String[] args){
//
//        ArrayList<Hero> hl = new ArrayList<>();
//
//        ArrayList<Hero> al = new ArrayList<>();
//        MyHashMap mhm = new MyHashMap();
//        for (int i = 0; i < 1000000; i++) {
//            Random rand = new Random( System.currentTimeMillis()+i);
//            StringBuffer sb = new StringBuffer();
//            sb.append("hero-");
//            sb.append(rand.nextInt(9));
//            sb.append(rand.nextInt(9));
//            sb.append(rand.nextInt(9));
//            sb.append(rand.nextInt(9));
//
//            Hero hero = new Hero(sb.toString(),i);
//            al.add(hero);
//            //mhm.put(sb.toString(),hero);
//        }
//
//        for(Hero h:al){
//            List<Hero> list = (List<Hero>)mhm.get(h.getName());
//            if(null == list){
//                list = new ArrayList<Hero>();
//                mhm.put(h.getName(),list);
//            }
//            list.add(h);
//        }
//
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < al.size(); i++) {
//            Hero h = al.get(i);
//            String name = h.getName();
//            if(name.equals("hero-5555")){
//                hl.add(h);
//            }
//        }
//        long end = System.currentTimeMillis();
//
//        long elapsed = end -start;
//
//        System.out.println("ArrayList列表中共有"+al.size()+"个对象");
//        System.out.println("用for循环查找到了"+hl.size()+"个名字叫hero-5555的对象");
//        System.out.println("耗时："+elapsed);
//
//
//
//        start = System.currentTimeMillis();
//        List<Hero> hlist = (List<Hero>) mhm.get("hero-5555");
//        end = System.currentTimeMillis();
//        elapsed = end - start;
//        System.out.println("用MyHashMap查找到了"+hlist.size()+"个名字叫hero-5555的对象");
//        System.out.println("耗时："+elapsed);
//    }
}
