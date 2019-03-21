package CollectionTest;

import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    //压入栈
    public void push(T v){storage.addFirst(v);}

    //查看栈顶端元素
    public T peek(){return storage.getFirst();}

    //弹出栈顶端元素
    public T pop(){return storage.removeFirst();}

    //是否为空
    public boolean isEmpty(){return storage.isEmpty();}

    //展示栈结构
    public String toString(){return storage.toString();}
}
