package integer;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * 包装类有一个非常实用的功能，就是可以将字符串
 * 解析为对应的基本类型。但是前提是该字符串内容
 * 正确的描述了基本类型可以保持的值
 * @author wm
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        String num="123";
        //字符串是引用类型，不能强转为基本类型int
        int d=Integer.parseInt(num);
        System.out.println(d);

        double dou=Double.parseDouble(num);
        System.out.println(dou);
    }


}
