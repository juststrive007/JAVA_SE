package date;

import java.util.Calendar;

/**
 * void add(int field,int amount)
 * 对指定的时间分量加上给定的值，若给定的值为负数，
 * 就是减。
 */
public class CalendarDemo4 {
    public static void main(String[] args) {
        /**
         * 查看3年2个月零25天后的时间是哪天？
         *
         */
        //加3年
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.YEAR,3);
        //加2个月
        calendar.add(Calendar.MONTH,2);
        //加25天
        calendar.add(Calendar.DAY_OF_YEAR,25);
        System.out.println(calendar.getTime());


//        那周的周一是哪天
        calendar.set(Calendar.DAY_OF_WEEK,2);
        System.out.println(calendar.getTime());
    }
}
