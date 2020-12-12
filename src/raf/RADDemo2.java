package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取字节
 * @author wm
 */
public class RADDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile arf=new RandomAccessFile
                ("./raf.dat","rw");
        /**
         * 读一个字节
         * 0000 0000
         *
         * int read()
         * 读取1个字节，并以int形式返回（返回的int
         * 值只有“低八位”有数据，其余都是0）
         * 如果返回的int值为-1，则表示读取到了文件
         * 的末尾
         */
        int num= arf.read();
        System.out.println(num);
        arf.close();

    }
}
