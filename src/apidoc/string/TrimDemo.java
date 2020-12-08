package apidoc.string;

/**
 * 去除当前字符串两边的空白符
 * @author wm
 */
public class TrimDemo {
    public static void main(String[] args) {
        String str="  hello     ";
        System.out.println(str.length());
        String trim=str.trim();
        System.out.println(trim+trim.length());
    }
}
