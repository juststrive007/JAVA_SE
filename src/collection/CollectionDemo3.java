package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合仅能存放引用类型元素，并且存放的是元素引用地址
 *
 *  如果存放基本类型则会转换为包装类进行保存。
 * @author wm
 */
public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c=new ArrayList();

        Point p=new Point(1,2);

        c.add(p);

        p.setX(2);
        System.out.println(p);
        System.out.println(c);

    }
}
