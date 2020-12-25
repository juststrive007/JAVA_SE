package thread;

/**
 * 获取线程相关信息的方法
 * @author wm
 */
public class ThreadInfodemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        //获取线程名字
        String name=main.getName();
        System.out.println(name);
        //获取唯一标识
        long id=main.getId();
        System.out.println(id);
        //获取优先级
        int pri=main.getPriority();
        System.out.println(pri);

        //线程是否活着
        boolean isAlive=main.isAlive();
        System.out.println(isAlive);

        //线程是否为守护线程
        boolean isDaemon=main.isDaemon();
        System.out.println(isDaemon);

        //线程是否被中断
        boolean isInter=main.isInterrupted();
        System.out.println(isInter);
    }
}
