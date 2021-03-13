package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 使用反射调用方法
 * @author wm
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Person p=new Person();
        p.sayHi();

        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入要加载的类");
        String className=scanner.nextLine();
        System.out.println("请输入要调用的方法");
        String methodName=scanner.nextLine();



        //1实例化
        Class cls=Class.forName(className);
        Object o=cls.newInstance();
        //2调用方法
        //2.1利用反射获取要反射的方法
        Method method=cls.getMethod(methodName);
        method.invoke(o);

    }
}
