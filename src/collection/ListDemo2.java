package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List 提供的另一对通过下标操作元素的方法：
 * 重载的add，remove
 *
 * @author wm
 */
public class ListDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//jdk 1.7之后支持
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
        /**
         * void add(int index,E element)
         * 将指定元素插入到指定位置
         */
        list.add(2,"2");

        System.out.println(list);

        /**
         * E remove(int index)
         * 删除指定下标处对应得元素并将其返回。
         */

        String str=list.remove(2);
        System.out.println(list);
        System.out.println(str);


    }



}
