package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动以后要求用户在控制台输入自己的生日
 * 格式为：yyyy-MM-dd
 * 然后经过程序计算，输出到今天为止活了多少天
 * 然后再经过计算输出其出生10000天的纪念日为哪天
 * 输出日期格式同上
 * @author wm
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input your bi" +
                "rth day(yyyy-MM-dd)");
        String line=scanner.nextLine();
        //获取当前时间
        Date date=new Date();
        //获取出生时间
        SimpleDateFormat sdf=new SimpleDateFormat(
                "yyyy-MM-dd"
        );
        Date birth=sdf.parse(line);
        //获取生存时间
        long livetime=date.getTime()-birth.getTime();
        long days=livetime/1000/60/60/24;
        System.out.println("you lived "+days+"days");

        //出生10000天时间
        long future=birth.getTime()+10000L*1000*60*60*24;
        date.setTime(future);
        String futureday=sdf.format(date);
        System.out.println("10000day is"+futureday);
    }
}
