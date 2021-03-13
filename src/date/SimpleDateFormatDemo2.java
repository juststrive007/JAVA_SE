package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将一个字符串解析为Date对象
 * @author wm
 */
public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        String line="2008-08-08 20:08:08";
        SimpleDateFormat sdf=new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        /**
         * Date parse(String line)
         * 将给给定的字符串按照当前SDF指定的日期格式转换为Date对象
         */
        Date parse = sdf.parse(line);
        System.out.println(parse);
    }
}
