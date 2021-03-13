package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池主要解决两个问题：
 * 1.线程的重用
 * 线程的生命周期不应当与任务一致，否则可能出现线程频繁的创建
 * 与销毁，给系统带来不必要的开销
 * 2.控制线程数量
 * 一台计算机能够承载多少条线程并发运行的因素很多
 * 但是都是有一定限度，超过则会出现资源开销过大，
 * 甚至内存溢出，并且线程数量过多会导致cpu的过度切换，所有
 * 的线程并发性能都能降低。
 * @author wm
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
        /**
         * 创建一个固定大小的线程池
         * 参数为int值，用来指定线程池中的线程数量
         */
        ExecutorService threadpoll=
                Executors.newFixedThreadPool(50);
        //正常情况下，200-300并发服务是可行的


        for(int i=0;i<6;i++){
            Runnable r=new Runnable() {
                @Override
                public void run() {
                    try{
                        Thread t=Thread.currentThread();
                        System.out.println(t+"running");
                        Thread.sleep(5000);
                        System.out.println(t+"stop");

                    }catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                }
            };

            threadpoll.execute(r);
            System.out.println("give one job to thread pool");

        }
        threadpoll.shutdown();//等任务结束后关闭进程
//        threadpoll.shutdownNow();//立即关闭进程
        System.out.println("threadpool is shutdowning");


    }

}
