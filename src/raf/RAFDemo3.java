package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF读写基本类型数据以及RAF基于基本指针的操作
 * @author wm
 */
public class RAFDemo3 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=
                new RandomAccessFile("test1.dat","rw");

        long pos=raf.getFilePointer();
        System.out.println(pos);

        /**
         * 写入一个int最大值
         */
        int max=Integer.MAX_VALUE;
        //>>>带符号的移动，>>不带符号的移动
        raf.write(max>>>24);
        raf.write(max>>>16);
        raf.write(max>>>8);
        raf.write(max);
        /**
         * void writeInt(int d)
         * 将给定的int值对应得4个字节一次性写入到文件中，等同于上面的4步操作
         */
        raf.writeInt(max);

        raf.writeDouble(123.123);

        raf.writeFloat(12.12F);

        raf.writeLong(123L);
        System.out.println("finished");
        pos=raf.getFilePointer();
        System.out.println(pos);

        //操作指针
        raf.seek(0);
        System.out.println(raf.getFilePointer());
        int num=raf.readInt();
        System.out.println(num);//127


        raf.close();
    }
    
}
