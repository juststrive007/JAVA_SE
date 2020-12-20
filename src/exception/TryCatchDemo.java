package exception;

/**
 * 异常处理机制中的try-catch
 * 语法：
 * try {
 *     code;
 * }catch(XXXException e){
 *     当try中代码出现XXXException时的
 *     处理代码
 * }
 * @author wm
 */
public class TryCatchDemo {
    public static void main(String[] args) {

     try {
         System.out.println("program start:");
         String str="a";
         /*
         当JVM指定代码出现异常时，会自动实例化对应
         的异常实例，并将代码执行过程设置好，然后将
         其抛出。
          */
         System.out.println(str.length());
         System.out.println(str.charAt(0));
         System.out.println(Integer.parseInt(str));
         /**
          * try语句中某一句代码若出现异常，则后续内容不会再
          * 执行，执行下面catch后，就接着catch之后执行。
          */
         System.out.println("!!!!!!");
     }catch (NullPointerException e){
       System.out.println("nullpointer");
         /**
          *
          * catch可以写多个，针对不同异常有不同处理时
          * 可以分别捕获并处理
          *
          */
     }catch(StringIndexOutOfBoundsException e){
         System.out.println("outofindex");
         /**
          * 在最后一个catch捕获最大的Exception可以
          * 最大程度的避免因为一个未处理的异常导致
          * 程序中断。
          */
     }catch (Exception e){
         System.out.println("error");
     }

        System.out.println("exit");
    }
}
