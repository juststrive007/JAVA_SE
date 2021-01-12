package thread;

/**
 * 静态方法上使用synchronized后，该方法一定具有同步效果
 * 静态方法指定的锁对象为当前类的类对象（Class的实例，后面
 * 反射知识点会介绍它）。
 * 每个被JVM加载的类都有且只有唯一一个Class实例
 * 因此静态方法锁该对象就一定具备同步效果
 * @author wm
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Foo foo1=new Foo();
        Foo foo2=new Foo();

        Thread t1=new Thread(){
            public void run(){
                foo1.dosome();
            }
        };

        Thread t2=new Thread(){
            public void run(){
                foo2.dosome();
            }
        };
        t1.start();
        t2.start();
    }
}
class Foo{
    //  public static synchronized void dosome(){
    public static void dosome() {
        /**
         * 静态方法中使用同步块时，指定的同步监视器对象依然
         * 选择当前类的类对象，获取方式为：类名.class
         */
        synchronized (Foo.class) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + "running dosomething");
                Thread.sleep(5000);
                System.out.println(t.getName() + "done!");

            } catch (Exception e) {

            }
        }
    }
}
