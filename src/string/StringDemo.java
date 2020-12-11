package string;

/**
 * String是不变对象，即：字符串对象一旦创建，
 * 内容不可改变，改变要创建信息对象
 * 其中一个原因和常量池有关：
 * 字符串常量池：JVM在堆中有一段内存是缓存所有使用字面量
 * 形式创建的字符串对象，一旦我们使用
 * 已有的字面量再次创建字符串对象时，会直接重用
 * 这样会减小内存开销
 *
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1="123abc";
        String s2="123abc";
        System.out.println(s1==s2);
        String s3="123abc";
        System.out.println(s1==s3);
        String s4=new String("123abc");
        System.out.println(s1.equals(s4));
        /**
         *
         * 编译期有一个特性：在编译期间就能确定一个
         * 计算表达式的结果时，编译期会直接进行计算，
         * 并将结果编译到class文件中
         * 例如下面代码会被编译改为
         * String s5 = "123abc"
         */
        String s5="123"+"abc";
        System.out.println(s5==s2);

        String s="123";
        String s6=s+"abc";
        System.out.println(s2==s6);

    }
}
