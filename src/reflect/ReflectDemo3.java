package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * ʹ�÷�����÷���
 * @author wm
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Person p=new Person();
        p.sayHi();

        Scanner scanner=new Scanner(System.in);
        System.out.println("������Ҫ���ص���");
        String className=scanner.nextLine();
        System.out.println("������Ҫ���õķ���");
        String methodName=scanner.nextLine();



        //1ʵ����
        Class cls=Class.forName(className);
        Object o=cls.newInstance();
        //2���÷���
        //2.1���÷����ȡҪ����ķ���
        Method method=cls.getMethod(methodName);
        method.invoke(o);

    }
}
