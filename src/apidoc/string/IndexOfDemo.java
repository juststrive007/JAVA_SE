package apidoc.string;

/**
 * int indexOf(String str)
 * 检索给定字符串在当前字符串中的位置，如若当前字符串
 * 不包含给定内容时放回-1
 * @author wm
 */
public class IndexOfDemo {
    public static void main(String[] args){
        String str = "thinking in java";
        int index=str.indexOf("in");
        System.out.println(index);
    }

}
