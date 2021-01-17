package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * SortListDemo1案例中Collections的sort方法要求
 * 集合元素必须可以比较（实现Comparable接口）
 * 然后才能通过比较大小后按照从小到大排序。
 * @author wm
 */
public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list=new ArrayList<>();
        list.add(new Point(5,6));
        list.add(new Point(1,3));
        list.add(new Point(2,4));
        list.add(new Point(6,9));
        list.add(new Point(7,8));

        System.out.println(list);
        /**
         * 这里编译不通过，因为point没有实现Comparable
         * 接口，通常我们自定义的类作为集合元素并且需要排序
         * 操作时，我们不直接继承该接口因为这对我们的程序具有侵入性
         *
         * 侵入性：当我们调用某个API时，其要求我们除了调用方法
         * 这句代码外还额外需要修改代码时，就具有侵入性，修改的
         * 越多侵入性越强。侵入性不利于代码维护。
         *
         * spring 低侵入性，高可用性
         */
     //   Collections.sort(list);
//        System.out.println(list);

        //通过重载方法，
        /**
         * Collections的重载的sort方法要求除了传入要排序的List集合外
         * 还要传入一个参数：Comparable.
         * 我们可以适用匿名内部类的形式临时创建一个额外的比较强（比较规则）
         * 使得该sort方法按照我们给定的比较规则比较集合元素后进行自然排序。
         * 该方法就不再要求集合元素必须实现Comparable接口了
         * 此方法适用的场景：
         * 1.比较自定义元素（元素本身没有实现comparable）
         * 2.额外的排序规则。因为有些元素已经实现了Comparable接口，
         * 但是其定义的比较规则不符合我们排序的需求时，我们也可以借助此方法
         * 临时提供比较规则并排序
         *
         * compare方法是用来定义两个参数O1，O2的大小的
         * 判断规则的
         * 当返回值>0时，表示o1>o2
         * 当返回值=0时，表示o1=o2
         * 当返回值<0时，表示o1<o2
         */
        Collections.sort(list, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int len1=o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int len2=o2.getX()*o2.getX()+o2.getY()*o2.getY();

                return len1-len2;
            }
        });
        System.out.println(list);
    }

}
