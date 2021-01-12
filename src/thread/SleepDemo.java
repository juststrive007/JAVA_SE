package thread;

import java.util.Scanner;

/**
 * sleep阻塞
 * 线程提供了一个静态方法：
 * static void sleep(long ms)
 * 该方法可以让运行这个方法的线程处于阻塞状态指定毫秒，超时
 * 后线程会自动回到RUNNABLE状态
 * 等待再次分配时间片并发运行。
 * @author wm
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("program start");
        System.out.println("please input numner");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        for (int i = num; i >0; i--) {
            System.out.println("the time is " + i);
            try {
                Thread.sleep(1000);
            }catch (Exception e ){
                e.printStackTrace();

            }
        }
//        System.out.println("time out");

        //        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("program stop");
    }
}
