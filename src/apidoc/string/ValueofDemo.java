package apidoc.string;

/**
 * String 提供了一组静态方法valueOf
 * 可以将给定的内容转换为字符串，常用的是将
 * 基本类型转换为字符串
 * @author wm
 */
public class ValueofDemo {
    public static void main(String[] args) {
        int num=1234;
        //专业、性能好
        String s=String.valueOf(num);
        System.out.println(s);

        s=num+"";

    }
}
