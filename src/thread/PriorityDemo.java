package thread;

import com.sun.org.apache.xml.internal.resolver.readers.TextCatalogReader;

/**
 * 线程的优先级
 * 线程有10个优先级，分别用整数1-10标识
 * 其中1为最低优先级，5位默认优先级，10为最高优先级
 * 优先级越高的线程获取CPU时间片的次数越多。
 * @author wm
 */
public class PriorityDemo {
    public static void main(String[] args) {
        Thread max=new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("max");
                }
            }
        };

        Thread min = new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("min");
                }
            }
        };

        Thread normal=new Thread(){
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("normal");
                }
            }
        };

        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);

        max.start();
        min.start();
        normal.start();
    }
}
