package apidoc.string;

/**
 * 实现方法，完成获取域名的操作
 * @author wm
 */
public class Test {
    public static void main(String[] args) {
        String name = getHostName("www.baidu.com");
        System.out.println(name);

        name = getHostName("http://www.google.com");
        System.out.println(name);

    }

    public static String getHostName(String loc) {
        String s;
        int start=loc.indexOf(".")+1;
        int end=loc.indexOf(".",start);
        s=loc.substring(start,end);

        return s;
    }
}