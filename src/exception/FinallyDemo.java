package exception;

/**
 * finally块
 * finally块是异常处理机制的最后一块，它可以保证只要代码指定
 * 到了try当中，无论是否抛出异常，finally块中的代码都会
 * 执行
 * 因此我们经常讲释放资源这类操作放在这里，比如IO中的流
 * 关闭操作
 * @author wm
 */
public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println("program start");
        try {
            String str=null;
            System.out.println(str.length());
            return;
        }catch (Exception e){
            System.out.println("error");
        }
        finally {
            System.out.println("program end ");
        }

    }
}
