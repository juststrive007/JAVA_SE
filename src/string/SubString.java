package string;

/**
 * String subString(int start,int end)
 * 截取指定范围内的字符串
 * 注：java API中通常使用两个数字表示范围时
 * 都是"含头不含尾"
 * @author wm
 */
public class SubString {
    public static void main(String[] args) {
        String host="www.google.com";
        String sub=host.substring(4,10);
        System.out.println(sub);
        sub=host.substring(4);
        System.out.println(sub);
    }
}
