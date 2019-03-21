package CollectionTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListTest {

   public void Dequerun(){
       LinkedList<String> ll = new LinkedList<>();

       //在链表尾部添加元素
       ll.addLast("run10");
       ll.addLast("run2");
       ll.addLast("run4");

       //在链表头部添加元素
       ll.addFirst("run1");

       System.out.println(ll);

       //查看最前面的元素
       System.out.println(ll.getFirst());

       //查看最后面的元素
       System.out.println(ll.getLast());

       //取出最前面的元素
       System.out.println(ll.removeFirst());

       //取出最后面的元素
       System.out.println(ll.removeLast());

       System.out.println(ll);
   }

   public void Queuerun(){

       //实现一个队列
       Queue<String> q = new LinkedList<String>();

       //在队列后添加元素
       System.out.println("新建队列：\t");
       q.offer("run1");
       q.offer("run2");
       q.offer("run3");
       q.offer("run4");

       System.out.println(q);

       //取出第一个元素
       String str = q.poll();
       System.out.println("取出第一个元素:");
       System.out.println(str);
       System.out.println("取出第一个元素后的队列:\t");
       System.out.println(q);

       //查看第一个元素
       str = q.peek();
       System.out.println("查看第一个元素:");
       System.out.println(str);
       System.out.println("查看当前队列:\t");
       System.out.println(q);
   }


//   public static void main(String[] agrs){
//       MyStack<String> ms = new MyStack<>();
//
//       ms.push("String1");
//       ms.push("String12");
//       ms.push("String13");
//       ms.push("String14");
//       ms.push("String15");
//       //展示栈
//       System.out.println(ms.toString());
//
//       //查看栈顶元素
//       System.out.println(ms.peek());
//
//       //弹出栈顶元素
//       System.out.println(ms.pop());
//       System.out.println(ms.toString());
//
//       //判断是否为空
//       System.out.println(ms.isEmpty());
//   }
}
