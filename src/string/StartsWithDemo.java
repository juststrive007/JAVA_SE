package string;

/**
 * boolean startWith(String str)
 * boolean endsWith(String str)
 * 判断当前字符串是否是以给定的字符串开始或结尾
 * @author wm
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str="www.baidu.com";
        System.out.println(str.startsWith("www"));
        System.out.println(str.endsWith("com"));
    }
}
