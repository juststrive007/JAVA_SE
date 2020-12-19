package io;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后，要求用户输入文件名，之后将用户输入的每一行字符串都
 * 顺序写入该文件，单独输入exit时程序退出
 *
 * 使用PW完成按行写入文本数据的操作。
 * 要求：独立完成流连接工作
 */
public class Note {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input file name:");
        String str=scanner.nextLine();

        FileOutputStream fos=new FileOutputStream(str);
        OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
        BufferedWriter bufferedWriter=new BufferedWriter(osw);
        /**
         * 当第一个参数为流时，这样的PW构造器就允许我们传入第二个参数，为一个boolean
         * 值，该值为true时，就打开了自动行刷新功能
         * 每当我们调用println 方法写出一行字符串后会自动flush
         */
        PrintWriter pw=new PrintWriter(bufferedWriter,true);

        System.out.println("please input the message");
        while (!"exit".equals(str=scanner.nextLine())){
            pw.println(str);

        }
        System.out.println("wirte finished");
        pw.close();

    }

}
