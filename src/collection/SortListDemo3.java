package collection;

import javax.sql.ConnectionPoolDataSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ����String
 * @author wm
 */
public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("����");
        list.add("��������һ");
        list.add("����");
        list.add("������");
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
