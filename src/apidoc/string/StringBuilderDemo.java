package apidoc.string;

/**
 * java.lang.StringBuilder
 * 该类是专门用来修改字符串的api。其内部维护一个
 * 可变的char数组，因此不会出现修改一次内容就创建
 * 一个新对象的问题（内存开销小，性能好）
 * 并且StringBuilder还提供了便于修改字符串的内容
 * ：增，删，改，插
 * @author wm
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        //默认实例化一个空字符串的bulder
        //StringBuilder builder=new StringBuilder();
        //通过字符串构造
        String str="study java in hard";
        StringBuilder builder=new StringBuilder(str);
        System.out.println(builder);

        //增加
        builder=builder.append(",for a good job");
        System.out.println(builder.toString());

        //修改
        builder.replace(19,33,"just for change word!");
        //输出时直接输出builder也是可以
        //因为输出方法内部会调用builder的toString 方法，
        //将返回的字符串输出
        System.out.println(builder.toString());

        //delete
        builder.delete(18,22);
        System.out.println(builder);

        //插入
        builder.insert(0,"wm ");
        System.out.println(builder);

    }
}
