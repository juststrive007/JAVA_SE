package thread;

/**
 * 第二种创建线程的方式
 * 实现Runnable接口单独定义任务
 * @author wm
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        //创建线程任务
        MyRunable myRunable =new MyRunable();
        MyRunable1 myRunable1 =new MyRunable1();
        //创建线程
        Thread t1=new Thread(myRunable);
        Thread t2=new Thread(myRunable1);
        //启动线程
        t1.start();
        t2.start();
    }
}

class MyRunable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("who are you ");
        }
    }
}
class MyRunable1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("i am polic");
        }
    }
}
