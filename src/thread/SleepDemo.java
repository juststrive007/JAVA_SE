package thread;

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
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("program stop");
    }
}
