package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * 集合转换为数组
 * Collection提供了一个方法toArray,可以将当前集合转换为
 * 一个数组
 * @author wm
 */
public class CollectionToArray {

    public static void main(String[] args) {
        Collection<String> c= new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println(c);
        /**
         * 该toArray方法会将元素存入我们给定的数组中并返回
         * （如果我们给定的数组长度不够，就会自动创建一个数组）
         */

        String[] ar=c.toArray(new String[c.size()]);
        System.out.println(ar.length);
        System.out.println(Arrays.toString(ar));


    }

}
