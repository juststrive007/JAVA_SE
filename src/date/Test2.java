package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日期
 * 程序启动后，要求输入商品的生产日期：yyyy-MM-dd
 * 然后在输入一个数字表示保质期的天数
 * 经过程序计算输出该商品的促销日期，促销规则：
 * 商品过期日前两周的周三为促销日。
 */
public class Test2 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        //输入生产日期与保质时间
        System.out.println("please input the produce day(yyyy-MM-dd)");
        String birth=scanner.nextLine();
        System.out.println("please input the day :");
        int day=scanner.nextInt();


        //解析输入时间为date
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date= sdf.parse(birth);

        //解析保质期时间
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_YEAR,day);
        Date outday=calendar.getTime();
        System.out.println(sdf.format(outday));
        for(int i=1;i<=2;i++){
            //往前推算一周
            calendar.add(Calendar.DAY_OF_YEAR,-7);
            //设定时间为周三
            //两次连续的set后条可能会覆盖第一条
            calendar.set(Calendar.DAY_OF_WEEK,4);

            String saleday=sdf.format(calendar.getTime());
            System.out.println("saleday:"+saleday);
        }



    }
}
