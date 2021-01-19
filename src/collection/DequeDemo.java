package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 双端队列
 * java.util.Deque接口，该接口是双端队列接口
 * 其继承自Queue，因此队列相关方法它也是具备的
 *
 * 双端队列是队列两端都可以做出入队的队列。
 * 常用实现类：java.util.LinkedList
 * @author wm
 */
public class DequeDemo {
    public static void main(String[] args) {
        Deque<String>  deque= new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offer("three");
        deque.offer("four");
        System.out.println(deque);

        deque.offerLast("five");
        System.out.println(deque);

        deque.offerFirst("zero");
        System.out.println(deque);


        String s=deque.pollLast();
        System.out.println(deque);
        System.out.println(s);
    }

}
