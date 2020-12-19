package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * java.io.InputeStreamReader
 * 转换流--输入
 *
 * InputStreamReader与OutputStreamWriter之所以成为
 * 转换流是因为：
 * 通常java中其他的高级字符流都只能连接到其他的字符流
 * 都不能直接连接字节流。但是转换流是可以连接在字节流上
 * 而其本身又是字符流，这样就可以让其他的字符流与字节流
 * 连接，起到了“转换器”的作用
 * @author wm
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=
                new FileInputStream("./src/io/ISRDemo.java");
        InputStreamReader isr=
                new InputStreamReader(fis);
//        char[] chars=new char[100];
        int d=-1;
        while ((d=isr.read())!=-1){
            System.out.print((char )d);
        }


    }
}
