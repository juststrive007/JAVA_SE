package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合的遍历
 * Collection为所有集合提供统一的遍历方式：
 * 迭代器模式
 *
 * Iterator iterator()
 * 该方法可以获取一个用于遍历当前集合元素的迭代器
 *
 * java.util.Iterator 迭代器接口
 * 不同的集合都提供了一个实现了迭代器接口的迭代器实现类，并
 * 通过该方法返回以用于遍历当前集合元素
 *
 * 使用迭代器遍历集合遵循三步：问取删
 * 其中删除元素不是必要操作
 * @author wm
 */
public class CollectionDemo5 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        System.out.println(c);

        Iterator it=c.iterator();

        while (it.hasNext()){
            /*
            E next()
            遍历集合下一个元素
             */
          String str=(String)it.next();
          System.out.println(str);
          if("#".equals(str)){
              /**
               * 迭代器在遍历的过程中不允许通过集合
               * 的方式增删元素，否则会抛出异常
               * 那么多个线程同时操作一个集合怎么操作？
               */
              //c.remove(str) //错误，迭代器不允许
              it.remove();
          }
        }
        System.out.println(c);


    }
}
