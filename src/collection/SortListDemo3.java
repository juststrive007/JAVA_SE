package collection;

import javax.sql.ConnectionPoolDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 排序String
 * @author wm
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("李四");
        list.add("格兰里以一");
        list.add("张三");
        list.add("王麻子");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {


                return o2.length()-o1.length();
            }
        });

        System.out.println(list);

    }
}
