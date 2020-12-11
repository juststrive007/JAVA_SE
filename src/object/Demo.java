package object;

/**
 * 使用当前类测试Object相关方法
 * @author wm
 */
public class Demo {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        /*
        System.out.println(Object obj)
        该方法将给定的对象输出到控制台时，会
        调用该对象的toString 方法，将返回的
        字符串输出。
        而Object定义的toString返回的字符串
        格式为：类名@地址，没有意义
         */
        System.out.println(p);

        /**
         * 任何类型和字符串连接结果都是字符串
         * 而java运行时实际操作是调用
         * toString方法，将返回的字符串与字符串
         * 连接
         */
        String str = "show:"+p;
        System.out.println(str);


        Point p2 =new Point(1,2);
        System.out.println(p==p2);

        System.out.println(p.equals(p2));

    }
}
