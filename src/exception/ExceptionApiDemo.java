package exception;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * 异常常见的方法
 * @author wm
 */
public class ExceptionApiDemo {
    public static void main(String[] args) {
        System.out.println("program start");
        try {
            String line="a";
            System.out.println(Integer.parseInt(line));
        }catch (Exception e){
            System.out.println("error");
            //输出错误堆栈信息
            e.printStackTrace();
            //获取错误消息
            String message=e.getMessage();
            System.out.println(message);

        }
        System.out.println("program end");
    }
}
