package apidoc.string;

/**
 * 获取给定位置上的字符
 * @author wm
 *
 */
public class CharAtDemo {
    public static void main(String[] args) {
       //           0123456789012345
        String str="thinking in java";
        char c =str.charAt(9);
        System.out.println(c);

        //avaj ni gnikniht
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
