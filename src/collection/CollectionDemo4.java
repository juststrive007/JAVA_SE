package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合操作
 * @author wm
 */
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add("java");
        c1.add("C++");
        c1.add("c");
        System.out.println("c1:"+c1);

        Collection c2=new HashSet();
        c2.add("php");
        c2.add("c#");
        c2.add("java");
        System.out.println("c2:"+c2);
        /**
         * boolen addAll(Collection c)
         * 将给定集合中的所有元素添加到当前集合
         * 若当前集合为set集需要注意，重复元素是不会
         * 添加的
         */
//       // System.out.println(c2.addAll(c1));//true
//        c2.addAll(c1);
//        System.out.println("c1:"+c2);
//
        c1.addAll(c2);
        System.out.println("c1:"+c1);

        Collection c3= new ArrayList();
        c3.add("c#");
        c3.add("java");
        c3.add("android");
        System.out.println("c3:"+c3);

        /**
         * boolean containsAll(Collection c)
         * 判断当前集合是否包含给定集合中的所有元素
         */
        boolean b=c1.containsAll(c3);
        System.out.println("c1 contains c3 ?:"+b);

        /**
         * boolean removeAll(Collection c)
         * 删除当前集合中与给定集合的共有元素。（包括重复的）
         */
        c1.removeAll(c3);
        System.out.println("c1:"+c1);
    }
}
