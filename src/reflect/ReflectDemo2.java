package reflect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 使用反射机制实例化对象
 * @author wm
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //实例化Person
        Person p=new Person();
        List list=new ArrayList();
        System.out.println("p"+p);
        System.out.println("1:"+list);

        //使用反射实例化
        //1加载要实例化的类的类对象
//        Class cls =Class.forName("reflect.Person");
        Scanner scanner=new Scanner(System.in);
        System.out.println("the input class is:");
        String className=scanner.nextLine();
        Class cls=Class.forName(className);

        //2通过类对象实例化
        /**
         * class提供了一个newInstance()方法用来实例化其表示的类的对象，但是前提是这个类
         * 要有无参的构造方法，否则不能用这个方式实例化。
         */

        Object obj=cls.newInstance();

        System.out.println("反射"+obj);
    }

}
