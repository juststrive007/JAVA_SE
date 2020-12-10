package apidoc.string;

/**
 * 字符串支持正则表达式方法一：
 * boolean matches（String regex)
 * 使用给定的正则表达式验证当前字符串是否符合格式要求
 * 符合返回true
 * 注：给定的正则表达式无论是否添加了边界匹配，都是
 * 做全匹配验证的。
 * @author wm
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String mail="juststrive007@gmail.com";
        /**
         * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
         */
        String regex="[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match=mail.matches(regex);

        if(match){
            System.out.println("right");
        }else{
            System.out.println("fault");
        }
    }

}
