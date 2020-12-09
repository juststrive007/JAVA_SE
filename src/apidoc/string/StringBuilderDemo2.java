package apidoc.string;

/**
 * StringBuilder 修改字符串的性能
 * @author wm
 */
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder("a");

        for (int i=0;i<10000000;i++){
            builder.append("a");
        }
        System.out.println("over");
    }
}
