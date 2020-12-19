package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * java将流按照读写单位分为：字节流与字符流
 * 字节流：以字节为单位读写，一次最少读写8位2进制
 * 字符流：以字符为单位读写，实际读写字节量由指定的
 * 字符集与读写的字符数据有关，但是在 java内部
 * 表示字符时都是用char表示（2字节）
 *
 * java.io.Writer , java.io.Reader
 * 上面两个类时抽象类，是所有字符输出流与字符输入流
 * 的超类，里面规定了读写字符的相关方法。
 *
 * java.io.OutputeStreamWriter
 * java.io.OutputeStreamReader
 * 转换流，他们是字符流的一对常用实现类，是一对高级流
 * 实际开发中我们在读写文本数据时，流连接中经常会使用到转换
 * 流，它们是流连接中重要的一环，但是我们不会直接操作这对流。
 *
 * @author wm
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=
                new FileOutputStream("./fos.txt");
       /*
       *转换流在创建时通过指定第二个参数来确定字符集编码，这样通过
       * 当前流写出的文本数据都会按照该字符集转换为字节后再写出
        */
        OutputStreamWriter osw=
                new OutputStreamWriter(fos,"utf-8");
        String line="lalalalla";
        osw.write(line);
        osw.flush();
        osw.close();
        System.out.println("ok");

    }
}


