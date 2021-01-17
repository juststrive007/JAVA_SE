package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 使用新循环遍历集合
 * @author wm
 */
public class NewForDemo2 {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        System.out.println(c);
        /**
         * 新循环遍历集合就是迭代器遍历，因此
         * 不要再遍历的过程中使用集合的方法增删元素
         */
        for(Object object:c){
            String str=(String)object;
            System.out.println(str);
        }
    }
}
