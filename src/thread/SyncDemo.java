package thread;

/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源时，由于线程
 * 切换时机不确定，导致操作代码执行顺序未按照
 * 设计意图执行所导致的操作混乱，严重时可能导致
 * 系统瘫痪。
 * 临界资源：同一时间只允许一条线程操作的资源。
 *
 * @author wm
 */
public class SyncDemo {


    public static void main(String[] args) {
        Table table=new Table();

        Thread t1=new Thread(){
            public void run(){
                while (true){
                    int bean=table.getBean();
//                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        Thread t2=new Thread(){
            public void run(){
                while (true){
                    int bean=table.getBean();
//                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };
        t1.start();
        t2.start();
    }
}

class Table{
    //20
    private int beans = 20;

    /**
     * 当一个方法被synchronized修饰后，该方法称为同步方法，
     * 即：多个线程不能同时在方法内部执行。
     * 将并发操作改为同步操作就能有效的解决多线程的并发安全问题了(把抢改为排队)
     * @return
     */
    public synchronized int getBean(){
        if(beans==0){
            throw new RuntimeException("no beans");
        }
        //主动让出执行该方法的线程的CPU时间
        Thread.yield();
        return beans--;
    }
}
