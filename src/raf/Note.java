package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后，要求输出文件名，然后对该文件进行写操作
 * 之后在控制台输入的每行字符串都顺序的写入到
 * 这个文件中，当单独输入了exit 时程序退出
 * 写入文件的文本数据统一用UTF-8编码
 * @author wm
 */


public class Note {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("please intput filename:");
        String filename=scan.nextLine();
        RandomAccessFile file =
                new RandomAccessFile(filename,"rw");
        String str;
        System.out.println("start input");
        while (!(str=scan.nextLine()).equals("exit")){
            file.write(str.getBytes("utf-8"));

        }
        file.close();
        System.out.println("ok!");
    }
}
