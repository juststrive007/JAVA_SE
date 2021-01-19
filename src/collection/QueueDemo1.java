package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * 队列是经典的数据结构之一，可以保存一组元素
 * 但是存取元素必须遵循先进先出的原则。
 *
 * java.util.Queue接口 --队列接口
 *
 * Queue继承自Collection，因此集合的基本方法队列也支持。
 * Queue的常用实现类：java.util.LinledList
 * @author wm
 */
public class QueueDemo1 {
    public static void main(String[] args) {
        /**
         * 由于LinkedList(链表）符合队列使用的相关
         * 特性，因此作为了Queue的实现类
         */
        Queue<String>  queue= new LinkedList<>();

        //入队操作
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        System.out.println(queue);

        //出队操作，获取并删除队首元素
//        queue.poll()
//
        String str=queue.peek();
        System.out.println(queue);
        System.out.println(str);

        str=queue.poll();
        System.out.println(str);
        System.out.println(queue);

        System.out.println(queue.size());
        for(String s:queue){
            System.out.println(s);
        }
        System.out.println(queue);

        /**
         * 使用poll方法遍历队列
         * 这种方式遍历后队列中就没有元素了
         */
        while (queue.size()>0){
            String s1=queue.poll();
            System.out.println(s1);
        }
        System.out.println(queue);

    }



}
