package date;

import java.util.Calendar;

/**
 * Calendar提供了方法：
 * int get(int field)
 * 获取指定时间分量所对应的值。
 * 时间分量由Calendar以常量的形式提供。
 * @author wm
 */
public class CalendarDemo2 {
    public static void main(String[] args) {
        //创建calendar
        Calendar calendar=Calendar.getInstance();

        //获取年
        int year=calendar.get(Calendar.YEAR);
        //获取月，月份是从0开始计算
        int month=calendar.get(Calendar.MONTH);
        //获取日期
        /**
         * 获取日
         * 和“天”相关的时间分量：
         * DATE：月中的天，俗称的几号
         * DAY_OF_MONTH:与DATE一致
         * DAY_OF_WEEK：周中的天，周几
         * DAY_OF_YEAR：年中的天
         */
        int day=calendar.get(Calendar.DATE);

        //获取时分秒
        int h=calendar.get(Calendar.HOUR_OF_DAY);
        int m=calendar.get(Calendar.MINUTE);
        int s=calendar.get(Calendar.SECOND);

        System.out.println(year+"-"+ month+"-"+ day);
        System.out.println(h+"-"+ m +"-"+s);

        //今天是今年的第几天？
        int days=calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("today is the "+days+" day of year ");

        //今天是周几?
        int day_week=calendar.get(Calendar.DAY_OF_WEEK)-1;
        String[]  week= {"日","一","二","三","四","五","六"};
        System.out.println("今天是周"+week[day_week]);

        /**
         * 获取指定时间分量所允许的最大值：
         * 例如，本月最多天数
         *
         */

       int  day_month=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("this month have "+day_month+" days");
    }
}
