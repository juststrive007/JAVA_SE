package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * JDK7之后推出了一个特性：自动关闭
 *
 * @author wm
 */
public class AutoCloseableDemo {
    public static void main(String[] args) {
        /**
         * 只有实现了Autocloseable接口类才能在()中
         * 定义，流和RandomAccessFile都实现了这个
         * 接口
         * 编译器会在编译时将这里定义的内容最终在
         * finally 中调用close方法关闭。
         */
        try (FileOutputStream fos=
                     new FileOutputStream("fos.dat"))
        {
            fos.write(1);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
