package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文本中读取文本数据
 * @author wm
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=
                new RandomAccessFile("./raf.txt","r");
        byte[] data = new byte[(int)raf.length()];

        raf.read(data);
        String str=new String(data);
        System.out.println(str);
    }
}
