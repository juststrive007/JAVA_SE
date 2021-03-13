package date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * java.util.Calendar 日历类
 * Calendar是一个抽象类，规定了操作时间的一系列方法
 * 常用的实现类：GregorianCalendar,即：阳历
 * Calendar提供了一个静态方法getInstance()可以
 * 根据当前系统所在地区获取一个适用的实现类，大部分获取
 * 回来的都是阳历实现类，并且其内部表示的时间默认为当前
 * 系统时间。
 * @author wm
 */
public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar calendar=GregorianCalendar.getInstance();
        System.out.println(calendar);

        /**
         * Date getTime()
         * 将当前Calendar表示的时间以Date对象形式返回。
         */
        Date date=calendar.getTime();
        System.out.println(date);

        /**
         * void setTime(Date date)
         * 调整Calendar表示给定的Date所表示的日期
         */
        calendar.setTime(date);


    }
}
