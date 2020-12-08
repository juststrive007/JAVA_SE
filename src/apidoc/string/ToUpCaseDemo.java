package apidoc.string;

/**
 * String toUpperCase()
 * String toLowerCase()
 * 将当前字符串中的英文部分转换为全大写或全小写
 */
public class ToUpCaseDemo {
    public static void main(String[] args) {
        String str = "我爱java";
        System.out.println(str);

        String upper=str.toUpperCase();
        System.out.println(upper);

        String lower=upper.toLowerCase();
        System.out.println(lower);
    }
}
