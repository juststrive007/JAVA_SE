package string;

/**
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为给定
 * 的内容
 * @author wm
 */
public class RepalceAll {
    public static void main(String[] args) {
        String str="abc123def456hij";
        /*
        将字符串中的数字部分替换成#NUMBER#
         */
        str=str.replaceAll("[0-9]+","#NUMBER#");
        System.out.println(str);
    }
}
