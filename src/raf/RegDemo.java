package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册功能
 * 程序启动后要求用户输入用户名，密码，昵称，年龄
 * 然后将该用户的信息写入user.dat文件保存
 *    //信息固定长度100字节：32+32+32+4=100
 *
 * @author wm
 */
public class RegDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        RandomAccessFile raf=
                new RandomAccessFile("./user.dat","rw");
        raf.seek(raf.length());
        System.out.println("name:");
        String name=scanner.nextLine();
        System.out.println("password:");
        String passwd=scanner.nextLine();
        System.out.println("nc:");
        String nc=scanner.nextLine();
        System.out.println("age");
        int age=scanner.nextInt();

        //写名字
        byte[] name1=name.getBytes("utf-8");
        //将数组扩容至32字节
        name1= Arrays.copyOf(name1,32);
        raf.write(name1);

        //写密码
        byte[] passwd1=passwd.getBytes("utf-8");
        passwd1=Arrays.copyOf(passwd1,32);
        raf.write(passwd1);

        //写昵称
        byte[] nc1=nc.getBytes("utf-8");
        nc1=Arrays.copyOf(nc1,32);
        raf.write(nc1);

        //写年龄
        raf.writeInt(age);


        System.out.println("ok");
        raf.close();




    }
}
