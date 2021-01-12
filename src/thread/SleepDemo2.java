package thread;

/**
 * sleep方法要求我们处理中断异常
 * 当一个线程调用sleep处于阻塞状态的过程中
 * 这个线程的interrupt方法被调用时，此时sleep
 * 方法就会抛出中断异常来强制打断睡眠阻塞
 * @author wm
 */
public class SleepDemo2 {
    public static void main(String[] args) {
        Thread lin =new Thread(){
          public void run(){
              System.out.println("lin:sleep for a while");
              try {
                  Thread.sleep(1000000);
              } catch (InterruptedException e) {
                  System.out.println("lin:fuck!");

              }
              System.out.println("lin:awak");
          }
        };
        Thread huang=new Thread(){
          public void run(){
              System.out.println("huang:start hit");
              for(int i=0;i<5;i++){
                  System.out.println("huang:80!");
                  try {
                      Thread.sleep(1000);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
              System.out.println("huang:ok,done!");
             //此时会中断lin线程的阻塞
              lin.interrupt();

          }
        };

        lin.start();
        huang.start();
    }
}
