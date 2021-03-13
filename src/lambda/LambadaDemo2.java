package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 有参数和返回值的方法
 * @author wm
 */
public class LambadaDemo2 {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("canglaoshi");
        list.add("cuanqi");
        list.add("xiaoze");
        Collections.sort(list);

        //通过自定义比较器比较
//        Comparator<String> c=new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        };
//
//        Comparator<String> c1=(o1,o2)-> {
//           return o1.length() - o2.length();
//        }
        //如果省略大括号，return关键字也要省略

        Comparator<String> c1=(o1,o2)->
                o1.length()-o2.length();
        //将Lambada表达式带入，简化程序
        Collections.sort(list,(o1,o2)->o1.length()-o2.length());
    }
}
