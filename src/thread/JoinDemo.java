package thread;

/**
 * 线程提供一个方法：
 * void join()
 * 该方法允许调用此方法的线程阻塞，直到该方法所属的线程
 * 结束时解除阻塞状态
 * 使用此方法可以协调线程间的同步允许。
 *
 * 同步运行：允许有先有后顺序
 * 异步运行：各干各的，多线程并发本事就是异步允许
 * @author wm
 */
public class JoinDemo {
    public static boolean isFinish=false;

    public static void main(String[] args) {
        Thread download=new Thread(){
            public void run(){
                System.out.println("dl:start download picture!");
                for(int i=0;i<100;i++) {
                    System.out.println("picture:download" + i + "%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("dl:picture download finished");
                isFinish=true;
            }
        };
        Thread show =new Thread(){
          public void run(){
              try{
                  System.out.println("show:start show txt");
                  Thread.sleep(3000);
                  System.out.println("show:txt  show finished");

                  //等待download下载完毕
                  download.join();

                  System.out.println("show:start show picture");

                  if(!isFinish){
                      throw new RuntimeException("no picture");
                  }
                  System.out.println("show:picture show over");

              }catch (Exception e){
                  e.printStackTrace();

              }
          }
        };


        show.start();
        download.start();
    }
}
