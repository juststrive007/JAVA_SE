package thread;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 *多线程
 * 多线程改变了代码的执行方式，从串行操作改变为多段
 * 代码之间并行操作
 * 由于CPU的物理特性，实际上多线程程序并非真正同时
 * 多段代码，而是让这些代码片段“齐头并进”，走走停停
 * 造成感官上的“同时”。而这种执行方式称为"并发”
 *
 * 线程有两种创建方式：
 * 方式一：继承Thread并重写run方法来定义线程任务
 *
 * @author wm
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThrea2 t2 =new MyThrea2();
        /**
         * 启动线程，使其并发运行。
         * 注：启动线程要调用start方法
         */
        t1.start();
        t2.start();
    }
}

/**
 * 第一种创建线程的方式的优点在于创建简单。
 * 但是也存在缺点
 * 1.继承线程的同时，重写run方法来定义线程任务，这导致线程
 * 与任务必然存在了耦合关系，不利于线程的重用
 * 2.需要继承Thread类，这样就无法再继承其他类去复用方法了
 * 实际开发中不方便。
 * @author wm 
 */
class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("who are you !");
        }
    }
}

class MyThrea2 extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("I am police!");
        }
    }
}