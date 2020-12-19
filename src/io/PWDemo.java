package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * java.io.BufferedWriter
 * java.io.BufferedReader
 * 以上两个就是缓冲字符输出与输入流，是一对高级流
 * 内部有缓冲区，读写文本数据效率高
 *
 * java.io.printWriter
 * 内部总是连接BufferedWriter作为缓冲加速使用
 * 并且PW还支持自动行刷新功能，实际开发比较常用
 * @author wm
 */
public class PWDemo {
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * PrintWriter提供了对文件直接写操作的构造器
         * PrintWriter(File file)
         * PrintWriter(String path)
         * 并且以上两种构造器还支持一个重载，第二个参数
         * 为字符集的名称，这样可以按照字符集写出数据
         * （字符集：文件编码格式）
         */
        PrintWriter pw=
                new PrintWriter("./pw.txt");

        pw.println("this is a test1");
        pw.println("test again");

        pw.close();

        System.out.println("ok");
    }
}
