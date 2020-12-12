package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * RAF是专门用来读写文件数据的API，其基于指针
 * 对文件数据任意位置进行读写。
 * @author wm
 */
public class RAFDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 创建RAF有两个常用的构造方法：
         * RandomAccessFile(File f,string mode)
         * RandomAccessFile(String path,String mode)
         * 第二个参数为操作模式，有：
         * “r”：只读模式，仅对文件数据做读取操作
         * “rw”：读写模式，对文件数据可读可写
         */

        //对当前目录下的raf.dat文件进行操作
        RandomAccessFile raf=new RandomAccessFile
                ("./raf.dat","rw");
        /*
        将给定的int值对应得2进制的“低8位”
        写入文件
        */
        raf.write(97);
        raf.write(97);
        System.out.println("write ok");
        raf.close();


    }

}
