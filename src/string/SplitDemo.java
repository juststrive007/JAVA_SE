package string;

/**
 * 字符串支持正则表达式方法二：
 * String[] split(String regex)
 * 将当前字符串按照符合正则表达式的内容拆分
 * @author wm
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str="wa123ni56qpng";
        String regex="[0-9]+";
        String[] s=str.split(regex);
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
            builder.append(s[i]);
        }
        System.out.println(builder);
    }
}
