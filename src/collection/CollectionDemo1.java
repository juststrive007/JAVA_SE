package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合框架
 * java.util.Collection接口
 * Collection是所有集合的顶级接口，里面定义了所有集合都需要具备的功能。
 * 集合与数组一样，可以保存一组元素，并且提供了相应的操作方法，使用更方便。
 *
 * Collection下面派生了两个常用的子接口
 * java.util.List:线性表，特点是可以存放重复元素，并且有序。
 * java.util.Set:不可重复集合
 * 元素是否重复依靠元素自身equals比较结果而定
 * @author wm
 *
 */
public class CollectionDemo1 {
    public static void main(String[] args) {

        Collection c= new ArrayList();
//        Collection c=new HashSet();
        /**
         * boolean add (T t)
         * 向集合中添加给定元素，成功添加则返回true
         */
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
//        System.out.println(c.add("one"));
        System.out.println(c);

        /**
         * int size()
         * 返回当前集合元素个数
         */
        int size=c.size();
        System.out.println("size:"+size);

        /**
         * boolean isEmpty()
         * 判断集合是否为空集
         */
        boolean isEmpty=c.isEmpty();
        System.out.println("collection is none? :"+isEmpty);


        c.clear();
        System.out.println(c);
        size=c.size();
        System.out.println("size:"+size);
        isEmpty=c.isEmpty();
        System.out.println("empty? :"+isEmpty);

    }
}
