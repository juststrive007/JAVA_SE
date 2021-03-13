package lambda;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * lambda表达式，JDK8之后推出的特性
 * lambda可以让我们"以函数是式编程"
 * 直观感受是可以使用更简短的方式创建匿名内部类。
 * 使用lambda创建匿名内部类时所实现的接口必须
 * 只有一个抽象方法才可以使用
 * @author wm
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };

        //通过lambda表达式简化
        Runnable r2=()->{
            System.out.println("hello2");
        };
        //如果方法中只有一句代码，那么方法体的大括号
//        可以不写

        Runnable r3=()->System.out.println("hello3");

        ExecutorService threadpoll= Executors.newFixedThreadPool(5);
        threadpoll.execute(r);
        threadpoll.execute(r2);
        threadpoll.execute(r3);
        threadpoll.shutdown();
    }
}
