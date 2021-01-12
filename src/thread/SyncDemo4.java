package thread;

/**
 * 互斥锁
 * 当使用synchronized锁定多个代码片段，并且指定的都是同一个
 * 同步监视器对象时，这些代码片段之间就是互斥的，多个线程不能
 * 同时在这些代码片段间运行。
 * @author wm
 */
public class SyncDemo4 {
    public static void main(String[] args) {
        Boo boo=new Boo();
        Thread t1=new Thread(){
            public void run(){
                boo.methodA();
            }
        };

        Thread t2=new Thread(){
            public void run(){
                boo.methodB();
            }
        };
        t1.start();
        t2.start();

    }
}
class Boo{
    public synchronized void methodA(){
        try{
            Thread t= Thread.currentThread();
            System.out.println(t.getName()+"methodA start");
            Thread.sleep(5000);
            System.out.println(t.getName()+"methodA end" );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void methodB(){
        synchronized(this){
            try{
                Thread t= Thread.currentThread();
                System.out.println(t.getName()+"methodB start");
                Thread.sleep(5000);
                System.out.println(t.getName()+"methodB end");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
