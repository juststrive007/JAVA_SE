package io;

import java.io.*;

/**
 * java.io.BufferedReader
 * 缓冲字符输入流
 * 特点：块读数据效率高，并且可以按行读取字符串
 * @author wm
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=
                new FileInputStream("./src/io/BRDemo.java");
        InputStreamReader isr=
                new InputStreamReader(fis);
        BufferedReader br=
                new BufferedReader(isr);
        String line=null;
        /**
         * String readLine()
         * 返回一行字符串，缓冲流会将一行字符串（到
         * 换行符“\n"为止，但是不包括"\n"）的内容返回
         * 若返回值为null则表示流已经读取到末尾
         */
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();

    }
}
