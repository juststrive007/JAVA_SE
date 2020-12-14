package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 显示所有用户信息
 * @author wm
 */
public class ShowAllUserDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf =
                new RandomAccessFile("./user.dat","rw");

       for(int i=0;i<(raf.length()/100);i++) {
           //读名字
           byte[] data = new byte[32];
           raf.read(data);
           String name = new String(data, "utf-8").trim();

           //读密码
           raf.read(data);
           String passwd = new String(data, "utf-8").trim();

           //读昵称
           raf.read(data);
           String nc = new String(data, "utf-8").trim();

           //读年龄
           int age = raf.readInt();

           System.out.println("pot" + raf.getFilePointer());
           System.out.println("name:" + name + ",passwd:" + passwd + ",nc:" + nc + ",age:" + age);
       }
        raf.close();
    }
}
