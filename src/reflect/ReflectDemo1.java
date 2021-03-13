package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * java 反射机制
 * 反射是一种动态机制，运行我们在程序运行期间实例化对象，调用方法，
 * 操作属性等
 * 反射可以提高代码的灵活度，但是会带来更多的系统
 * 开销和较慢的运行效率
 * 因此，反射只在关键的地方使用，不应过度依赖
 * @author wm
 */
public class ReflectDemo1 {
    public static void main(String[] args) {
        /**
         * Class类，称为：类的类对象
         * JVM加载一个类的时候会连同实例化一个Class的实例，用其
         * 表示加载的这个类，
         * 通过它可以获取其表示的类的一切信息获取
         * 类名，方法属性，构造器等，并且可以调用他们
         * 反射的第一步就是要获取要操作的类的类对象，从而
         * 在运行期间得知该类的相关信息以便进行操作，获取类
         * 对象的方法有：
         * 1.类名.class
         * java中任何类都可以这样做，但是这种方式是硬编码的形式获取，
         * 不灵活，但是直接，如
         * Class cls =int.class;
         * Class cls=String.class;
         *
         * 2.Class.forName(String className)
         * 通过Class的静态方法forName获取
         * 这里传入的参数为要加载的类的完全限定名
         * 包名.类名 如：
         * Class cls=Class.forName("java.lang.String");
         *
         * 3.通过类加载器ClassLoader获取
         */

        //加载String的类对象
//        Class cls=String.class;

        try {
            /**
             * java.util.HashMap
             * java.util.ArrayList
             * java.io.FileInputStream
             * reflect.Person
             */
            Scanner scanner=new Scanner(System.in);
            System.out.println("请输入要加载的类的名字：");
            String className =scanner.nextLine();
            Class cls1=Class.forName(className);
            String name1=cls1.getName();
            System.out.println(name1);

            //通过Class获取其表示的类的所有方法
//            Method[] methods=cls1.getMethods();

            //获取本类自己定义的方法（不含继承的）
            Method[] methods=cls1.getDeclaredMethods();

            for (Method method:methods){
                System.out.println(method.getName());
            }




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

