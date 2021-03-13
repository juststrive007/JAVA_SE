package date;

import java.util.Date;

/**
 * java.util.Date 日期类
 * Date的每一个实例用于表示一个时间。
 * 内部维护一个long值，该值表示自：
 * 1970-01-01 00:00:00到当前Date表示的时间之间
 * 所经过的毫秒。
 *
 * Date存在时间问题和千年虫问题，因此大部分方法
 * 在JDK1.1发布时就声明为过时方法，不再建议使用。
 * @author wm
 */
public class DateDemo {
    public static void main(String[] args) {
        //默认实例化表示当前系统时间
        Date date=new Date();
        System.out.println(date.toString());
        /**
         * Date大部分方法都是过时的
         */
//        date.getYear();
        /**
         * long getTime()
         * 获取Date内部维护的long值
         *
         */
        long time=date.getTime();
        System.out.println(time);

        time=time/1000/60/60/24;
        System.out.println("frome 1970,the days was gong:"+time);

        date.setTime(0);
        System.out.println(date);

    }
}
