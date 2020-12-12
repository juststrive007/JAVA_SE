package integer;

/**
 * 包装类
 * 包装类是为了解决基本类型不能直接参与面向对象开发
 * 而诞生的，让基本类型可以以“对象”的形式存在。
 * @author wm
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int a =1;
        //基本类型转换为对应得包装类
        //java建议使用valueof转换
        Integer i1=Integer.valueOf(a);
        Integer i2=Integer.valueOf(a);

        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        //包装类装换为基本类型
        int d=i1.intValue();
        System.out.println(d);
        //double
        System.out.println(i1.doubleValue());
        //从大往小的转存在溢出问题
        byte b=i1.byteValue();
        System.out.println(b);

        /**
         * 所有数字类型的包装类都有两个常量：
         * MAX_VALUE ,MIN_VALUE
         * 用来记录其对应得基本类型的取值范围
         */
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);

        long lmax=Long.MAX_VALUE;
        long lmin=Long.MIN_VALUE;
        System.out.println(lmax);
        System.out.println(lmin);
    }
}
