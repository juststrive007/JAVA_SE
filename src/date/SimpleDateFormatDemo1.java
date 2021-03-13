package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 可以将Date与String按照指定的日期格式进行相互转换
 * @author wm
 */
public class SimpleDateFormatDemo1 {
    public static void main(String[] args){
        Date date=new Date();
        /**
         * 2021-10-24 10:30:22 星期六 下午
         * yyyy-MM-dd HH:mm:ss  E    a
         * 将给定的Date所表示的时间按saf的格式显示
         */
        SimpleDateFormat sdf=new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss E a");
        String line=sdf.format(date);
        System.out.println(line);

    }
}
