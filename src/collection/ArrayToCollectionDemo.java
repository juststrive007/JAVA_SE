package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组转换为集合
 * 数组的工具类：java.util.Arrays提供了一个静态方法
 * asList,可以将给定的数组转换为List集合
 *
 * @author wm
 */
public class ArrayToCollectionDemo {
    public static void main(String[] args) {
        String[] array={"one","two","three","four","five"};

        System.out.println(Arrays.toString(array));

        List<String> list=Arrays.asList(array);
        System.out.println(list.size());
        System.out.println(list);

        /**
         * 需要注意，从数组转换来的集合对它的元素做操作就是对
         * 源数组元素做操作
         */
        list.set(1,"2");
        System.out.println(list);
        System.out.println(Arrays.toString(array));
        /**
         * 由于数组的定长，因此对该集合的增删元素
         * 操作都是不支持的，会抛出异常。
         */
//        list.add(1,"2");
//          list.remove(1);
        //解决方法：通过自己创建的集合进行操作
        /**
         * 所有的集合都支持一个参数为Collection的
         * 构造方法，作用是创建集合的同时包含给定集合
         * 的所有元素
         */
        List<String> list2=new ArrayList<>(list);
        list2.remove(2);
        System.out.println(list2);
        list2.add(2,"yes");
        System.out.println(list2);
    }
}
