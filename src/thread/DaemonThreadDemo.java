package thread;

/**
 * 守护线程
 * 守护线程也称为后台线程，默认创建的线程都是普通线程
 * ，通过设置可以将一个普通线程变成守护线程
 * 守护线程咋其创建与使用上与普通线程无差别，但是
 * 在结束的时机上有个区别，即进程结束
 *
 * 当一个进程中所有的普通线程都结束，进程就会结束，此时该进程中的
 * 所有在运行的守护线程都会被强行杀死。
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose=new Thread(){
            public void run(){
                for(int i=0;i<5;i++){
                    System.out.println("rose:let me go ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                System.out.println("rose:a a a a ");
                System.out.println("i dead");
            }
        };
        Thread jack =new Thread(){
            public void run(){
                while (true){
                    System.out.println("jack:you jump,i jump!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        rose.start();
        //守护进程守护所有普通进程
        //设置为守护进程（必须在start方法前调用）
        jack.setDaemon(true);
        jack.start();
//        while (true);



    }

}
