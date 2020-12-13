package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 向文件中写入文本数据
 * @author wm
 */
public class WriteStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile("raf.txt","rw");
        String str="www.baidu.com";
        byte[] bytes=str.getBytes("utf-8");
        raf.write(bytes);

//        raf.writeBytes(str);
        raf.close();
    }
}
