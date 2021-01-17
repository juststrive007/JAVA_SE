package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * java.util.List接口
 * 线性表，是Collection下面常见的子接口，特点是可以放重复
 * 元素，并且有序，提供了一组通过下标操作元素的方法
 * 常见的实现类
 * java.util.ArrayList:内部使用数组实现，
 * 查询性能更好，但是增删元素性能弱。
 *
 * java.util.LinkedList:增删元素性能好，尤其首尾
 * 增删元素性能最好，但是查询性能弱。
 * 对性能不是特别苛刻的情况下通常用ArrayList
 *
 * @author wm
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();//jdk 1.7之后支持
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

        /**
         * E get(int index)
         * 获取指定下标对应的元素
         */
        String str=list.get(0);
        System.out.println(str);

        for(int i=0;i<list.size();i++){
            str=list.get(i);
            System.out.println(str);
        }
//新循环只能遍历数组与集合，对于List无法遍历
//        for(Object t:(Collection)list){
//            System.out.println((String)t);
//        }
        /**
         * E set(int index,E element)
         * 将给定元素设置到指定位置，返回值为该位置原有元素
         */

        String old= list.set(1,"2");
        System.out.println(list);
        System.out.println(old);


        /**
         * 在不创建新集合的前提下，将list集合元素倒序
         */
//        int i=0;
//        int j=list.size()-1;
//        for(i=0;i<j;i++){
//            String str1 = list.set(i,list.get(j));
//            list.set(j,str1);
//            j--;
//        }


        for(int i=0;i<list.size()/2;i++){
           list.set(i,list.set(list.size()-1-i,list.get(i)));
        }

        System.out.println(list);

    }
}
