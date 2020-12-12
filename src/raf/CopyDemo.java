package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Timer;

/**
 * 拷贝文件用例
 * @author wm
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=
                new RandomAccessFile("./jpg.jpg","r");
        RandomAccessFile dst=
                new RandomAccessFile("./jpgcpy.jpg","rw");

        int info=-1;
        long start =System.currentTimeMillis();
        while ((info=src.read() )!=-1){
            dst.write(info);
        }
        long end=System.currentTimeMillis();
        System.out.println("finished,use time:"+(end-start));
        src.close();
        dst.close();
    }
}
