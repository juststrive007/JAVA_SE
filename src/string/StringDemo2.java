package string;

/**
 * String 频繁修改带来性能消耗
 * @author wm
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str="a";
        /*
        *由于字符串是不变对象，每次修改内容都会创建
        * 新的对象，如果开发需求中有对字符串频繁拼接
        * 等操作时，性能开销大。
        * 因此：字符串String不适合频繁修改内容


         */
        for (int i=0;i<10000000;i++){
            str+=str;

        }
        System.out.println("结束了");
    }
}
