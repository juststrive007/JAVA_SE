package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * java �������
 * ������һ�ֶ�̬���ƣ����������ڳ��������ڼ�ʵ�������󣬵��÷�����
 * �������Ե�
 * ���������ߴ�������ȣ����ǻ���������ϵͳ
 * �����ͽ���������Ч��
 * ��ˣ�����ֻ�ڹؼ��ĵط�ʹ�ã���Ӧ��������
 * @author wm
 */
public class ReflectDemo1 {
    public static void main(String[] args) {
        /**
         * Class�࣬��Ϊ����������
         * JVM����һ�����ʱ�����ͬʵ����һ��Class��ʵ��������
         * ��ʾ���ص�����࣬
         * ͨ�������Ի�ȡ���ʾ�����һ����Ϣ��ȡ
         * �������������ԣ��������ȣ����ҿ��Ե�������
         * ����ĵ�һ������Ҫ��ȡҪ�������������󣬴Ӷ�
         * �������ڼ��֪����������Ϣ�Ա���в�������ȡ��
         * ����ķ����У�
         * 1.����.class
         * java���κ��඼�������������������ַ�ʽ��Ӳ�������ʽ��ȡ��
         * ��������ֱ�ӣ���
         * Class cls =int.class;
         * Class cls=String.class;
         *
         * 2.Class.forName(String className)
         * ͨ��Class�ľ�̬����forName��ȡ
         * ���ﴫ��Ĳ���ΪҪ���ص������ȫ�޶���
         * ����.���� �磺
         * Class cls=Class.forName("java.lang.String");
         *
         * 3.ͨ���������ClassLoader��ȡ
         */

        //����String�������
//        Class cls=String.class;

        try {
            /**
             * java.util.HashMap
             * java.util.ArrayList
             * java.io.FileInputStream
             * reflect.Person
             */
            Scanner scanner=new Scanner(System.in);
            System.out.println("������Ҫ���ص�������֣�");
            String className =scanner.nextLine();
            Class cls1=Class.forName(className);
            String name1=cls1.getName();
            System.out.println(name1);

            //ͨ��Class��ȡ���ʾ��������з���
//            Method[] methods=cls1.getMethods();

            //��ȡ�����Լ�����ķ����������̳еģ�
            Method[] methods=cls1.getDeclaredMethods();

            for (Method method:methods){
                System.out.println(method.getName());
            }




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}

