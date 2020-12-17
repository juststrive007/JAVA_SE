package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 文件输入流，用于读取文件数据
 * 文件流与RAF的区别
 * 1.RAF是基于指针的随机读写，读写方式更灵活
 * 并且可以对文件部分内容覆盖进行编辑操作。
 * 而文件流不行，文件流是基于java标准IO的读写方式，
 * 而IO的读写为顺序读写，即：只能向后读或写操作，不能
 * 回退
 *
 * 2.文件流可以借助流连接完成复杂的数据读写操作，这一点是
 * RAF不容易做到的
 * 
 *
 * @author wm
 */
public class FISDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=
                new FileInputStream("./fos.txt");
        byte[] data =new byte[100];
        int len = fis.read(data);
        System.out.println("read length"+len);

        /**
         * String(byte[] data,int offset,int len,String csn)
         * 将给定的字节数组中从下标offset处的连续len个字节
         * 按照指定的字符集转换为字符串
         */
        String message = new String(data,0,len,"utf-8");
        System.out.println(message+","+message.length());
        fis.close();

    }
}
