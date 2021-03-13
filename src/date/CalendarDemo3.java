package date;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * 调整当前calendar指定分量为给定值
 * @author wm
 */
public class CalendarDemo3 {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        //调整为2008-08-08 20:08:08
        //改年
        calendar.set(Calendar.YEAR,2008);
        //改月
        calendar.set(Calendar.MONTH,Calendar.AUGUST);
        //改号
        calendar.set(Calendar.DAY_OF_MONTH,8);
        calendar.set(Calendar.HOUR_OF_DAY,20);
        calendar.set(Calendar.MINUTE,8);
        calendar.set(Calendar.SECOND,8);
        System.out.println(calendar.getTime());

        //DAY_OF_WEEK 从周日，0-周日， 4-周三
        calendar.set(Calendar.DAY_OF_WEEK,4);
        System.out.println(calendar.getTime());
        //注意更改时间后，尽量调用getTime方法，让系统执行计算。
    }
}
