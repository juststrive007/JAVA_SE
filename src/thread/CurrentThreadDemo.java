package thread;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * 线程提供了一个静态方法：
 * Thread currenThread()
 * 该方法可以获取运行这个方法的线程
 *
 * java中所有的代码都是靠线程运行的，main方法也是，
 * 运行main方法的线程叫“主线程”，也是我们程序的第一条
 * 线程
 * @author wm
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread main= Thread.currentThread();
        System.out.println("current thread is :"+main);

        dosome();

        Thread t=new Thread(){
          public void run(){
              Thread thread=Thread.currentThread();
              System.out.println("current thread is "+thread);
                dosome();
          }
        };
        t.start();
    }

    public static void dosome(){
        Thread t=Thread.currentThread();
        System.out.println("dosome thread is :"+t);
    }
}
