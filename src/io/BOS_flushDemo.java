package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲输出流的缓冲区问题
 * @author wm
 */
public class BOS_flushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=
                new FileOutputStream("test1.txt");
        BufferedOutputStream bos=
                new BufferedOutputStream(fos);

        String line="ce shi test wwww ssss ";

        bos.write(line.getBytes("utf-8"));
        /**
         * void flush()
         * 该方法是OutputStream定义的方法，实际上所有
         * 字节输出流都有该方法，但并非所有字节输出流都
         * 实现了这个方法的功能，只有缓冲流的该方法有
         * 实际的意义，作用是一次性将缓冲区已经缓冲的数据
         * 写出
         * 之所以所有字节输出流都有这个方法是因为流连接应用
         * 中缓冲流通常不是“终端流”（直接被我们操作的流）
         * 为了传递刷新缓冲区功能才有的。
         */
        bos.flush();
        System.out.println("ok!");
        bos.close();
    }
}
