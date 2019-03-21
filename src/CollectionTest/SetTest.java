package CollectionTest;

import java.util.*;

public class SetTest {


    public static String getRandomString(int length){
        Random rand = new Random(13);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = rand.nextInt(3);
            long result = 0;
            switch (number){
                case 0:
                    result = Math.round(Math.random()*25+65);
                    sb.append((char)result);
                    break;
                case 1:
                    result = Math.round(Math.random()*25+97);
                    sb.append((char)result);
                    break;
                case 2:
                    sb.append(new Random().nextInt(10));
                    break;
            }
        }

        return sb.toString();
    }

    public static String getRandomString1(int length){
        String source = "0123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASLKDJFHGMZNXBCV";
        Random rand = new Random();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < length; i++) {
            char a = source.charAt(rand.nextInt(source.length()));
            sb.append(a);
        }

        return sb.toString();
    }
    //-----------------------------------------------------------------------

    public void findSame(){
        //创建一个长度为100，元素为长度为2的字符串
        String[] str = new String[100];
        for (int i = 0; i <100 ; i++) {
            str[i] = getRandomString1(2);
        }

        //通过HashSet来查找里面的重复值
        HashSet<String> hset = new HashSet<>();
        List<String> al = new ArrayList<>();
        for(String temp:str){
            boolean isSame = !hset.add(temp);
            if(isSame)
                al.add(temp);
        }

        //打印结果

        System.out.println("其中重复元素数量："+al.size());
        System.out.println("它们是：");
        System.out.println(al);
    }

    //-----------------------------------------------------------------------
    public void Hashrun(){
        HashSet<Integer> hashset = new HashSet<>();

        hashset.add(33);
        hashset.add(3);
        hashset.add(333);
        hashset.add(3323);
        hashset.add(33413);
        hashset.add(3353);
        hashset.add(31353);
        hashset.add(76268);

        Iterator<Integer> it = hashset.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    //-----------------------------------------------------------------------
    public void setrun(){
        //HashSet中的数据不按添加顺序存储
        HashSet<Integer> hset =new HashSet<>();
        hset.add(88);
        hset.add(8);
        hset.add(888);

        System.out.println(hset);

        //LinkedHashSet中的数据按照添加顺序存储
        LinkedHashSet<Integer> lhset = new LinkedHashSet<>();
        lhset.add(88);
        lhset.add(8);
        lhset.add(888);

        System.out.println(lhset);

        //TreeSet中的数据会进行排序
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(88);
        tset.add(8);
        tset.add(888);

        System.out.println(tset);
    }


//    public static void main(String[] args){
//
//        SetTest st = new SetTest();
//
//        st.findSame();
//
//    }
}
