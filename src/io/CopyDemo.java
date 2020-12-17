package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件流完成文件的复制操作
 * @author wm
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 1 创建文件输入流读取文件
         * 2 创建文件流写入复制文件
         * 3.循环从原文件读取字节并写入到复制文件中
         * 完成复制工作
         */
        FileInputStream fis=
                new FileInputStream("./wm.pdf");

        FileOutputStream fos=
                new FileOutputStream("./wmcpy.pdf");

        byte[] data=new byte[1024*10];
        int len=-1;
        long start=System.currentTimeMillis();

        while((len=fis.read(data))!=-1){
            fos.write(data,0,len);
        }
        long end=System.currentTimeMillis();

        System.out.println("copy ok,use time: "+(end-start));
        fis.close();
        fos.close();
    }
}
