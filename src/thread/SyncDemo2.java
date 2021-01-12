package thread;

/**
 * 有效的缩小同步范围可以在保证并发安全的前提下提高并发效率。
 *
 * 同步块：
 * synchronized（同步监视器对象）{
 *     需要同步运行的代码片段
 * }
 * @author wm
 */
public class SyncDemo2 {
    public static void main(String[] args) {
        Shop shop=new Shop();

        Thread t1= new Thread(){
            public void run(){
                shop.buy();
            }
        };
        Thread t2= new Thread(){
            public void run(){
                shop.buy();
            }
        };
        t1.start();
        t2.start();

    }


}
class Shop{
    /**
     * 在方法上使用synchronized时，不需要单独指定同步监视器对象，
     * 而默认使用的就是this
     */
    //    public synchronized  void  buy(){
    public  void  buy(){
        try{
            Thread t=Thread.currentThread();
            System.out.println(t.getName()+"choice close");
            Thread.sleep(3000);

            /**
             * 使用同步块可以更精准的控制需要排队的代码片段，但是同步块要求
             * 必须制定同步监视器对象，该对象可以是java中任何类的实例，只要
             * 保证多个需要同步执行该代码片段的线程看到的是“同一个”即可。
             */
            synchronized (this) {
                System.out.println(t.getName() + "try close");
                Thread.sleep(3000);
            }
            System.out.println(t.getName()+"pay for it");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}