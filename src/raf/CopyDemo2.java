package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 提高每次实际读写数据量，减少实际读写对的次数
 * 是可以提高读写效率
 * 单字节读写是随机读写
 * 一组字节读写是块读写
 * @author wm
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src=
                new RandomAccessFile("./wm.pdf","rw");
        RandomAccessFile dst=
                new RandomAccessFile("./wmcopy.pdf","rw");

        /**
         * int read(byte[] data)
         * 一次性读取给定字节数组总长度的字节量，并装入数组中，返回值
         * 为实际读取到的字节数
         *
         */
        Long start= System.currentTimeMillis();
        byte[] data=new byte[1024*10];//10K
        int length=-1;
        while ((length=src.read(data))!=-1){
            dst.write(data,0,length);

        }
        Long end = System.currentTimeMillis();


        System.out.println("copy finished,use time "+(end-start));
        src.close();
        dst.close();
    }
}
