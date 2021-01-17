package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * List提供了获取子集的操作
 * List subList(int start,int end)
 * 获取指定下标范围内的子集，注意含头不含尾
 * @author wm
 */
public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }

        System.out.println(list);

        //获取3-7
        List<Integer> subList= list.subList(3,8);
        System.out.println(subList);

        //将子集中的每个元素扩大10倍
        for(int i=0;i<subList.size();i++){
            subList.set(i,subList.get(i)*10);

        }
        System.out.println(subList);
        /**
         * 对子集元素的操作就是对原集合对应元素的操作
         */
        System.out.println(list);
//        删除2-8
        list.subList(2,9).clear();
        System.out.println(list);
    }

}
