package collection;

import java.awt.*;
import java.io.RandomAccessFile;
import java.util.*;
import java.util.List;

/**
 * 集合的排序
 * java.util.Collections 集合的工具类
 * 定义这一组静态方法，便于我们操作集合。
 * 启动sort方法是对List集合进行自然排序的，即
 * 从小
 *
 * @author wm
 */
public class SortListDemo {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<10;i++){
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //按照从大到小排列
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2-o1;
            }



        });

        System.out.println(list);
    }
}
