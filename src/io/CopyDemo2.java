package io;

import java.io.*;

/**
 * 缓冲流
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 缓冲字节输出输入流是一对高级流，在流连接中的作用
 * 是提高读写效率（内部默认维护一个8K的字节数组，并
 * 将读写的数据统一转换为块读写从而提高效率）
 * @author wm
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=
                new FileInputStream("./wm.pdf");
        FileOutputStream fos=
                new FileOutputStream("./wmww.pdf");
        BufferedInputStream bis=
                new BufferedInputStream(fis);
        BufferedOutputStream bos=
                new BufferedOutputStream(fos);

        int len=-1;
        long start=System.currentTimeMillis();
        while((len=bis.read())!=-1){
            bos.write(len);
        }
        long end= System.currentTimeMillis();

        System.out.println("copy ok , use time "+ (end-start) );

        bis.close();
        bos.close();
    }

}
