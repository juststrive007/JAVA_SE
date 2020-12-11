package string;

/**
 * int indexOf(String str)
 * 检索给定字符串在当前字符串中的位置，如若当前字符串
 * 不包含给定内容时放回-1
 * @author wm
 */
public class IndexOfDemo {
    public static void main(String[] args){
        //            1234567890123456
        String str = "thinking in java";
        int index=str.indexOf("in");
        System.out.println(index);

        //从指定位置开始查找第一次出现的位置
        index = str.indexOf("in",9);
        System.out.println(index);

        //查找最后一次出现给定字符串的位置
        index = str.lastIndexOf("in");
        System.out.println(index);

    }

}
