package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 元素的equals方法影响着集合的很多操作
 * 比如：集合是根据equals方法判断是否重复元素
 * 还有判断包含元素或删除元素也会使用。
 * @author wm
 */
public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(3,4));
        c.add(new Point(5,6));
        c.add(new Point(7,8));
        c.add(new Point(1,2));

        System.out.println(c);
        /**
         * boolean contains(Object o)
         * 判断当前集合是否包含给定元素
         */
        Point p=new Point(1,2);
        Boolean contains=  c.contains(p);
        System.out.println("is contains:"+contains);

        /**
         * 删除给定元素
         * 找到的第一个
         */
        c.remove(p);
        System.out.println(c);
    }
}
