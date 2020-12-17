package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * java IO 标准的输入输出
 * java IO以标准化的操作对外界统一读写数据，
 * 并且将读写操作按照方向划分
 * 输入：从外界到程序的方向，使用来读取数据的
 * 输出：从程序到外界的方向，是用来写出数据的
 *
 * java.io.InputStream,java.io.OutputStream
 * 他们是抽象类，所有字节输入流都继承自InputStream
 * 所有字节输出流都继承自OutputStream
 * 这两个类中定义了响应的抽象方法，规定了所有输出
 * 输入流的基本的读写字节方法
 *
 * java 将流分为两大类
 * 节点流：又称为低级流，是实际连接数据源与程序的“管道”
 * 负责实际读写数据的流。
 * 读写一定是建立在节点流基础上的
 *
 * 处理流：不能独立存在，必须连接在其他流上，目的是当
 * 数据“流经”当前流时，对其进行加工处理。简化我们读写
 * 时对数据的相应的操作
 *
 * 文件流
 * java.io.FileInputStream
 * java.io.FileOutputStream
 * 常用的一对低级流实现类，用来连接文件，对文件进行读写操作
 * （功能上与RAF一致，但是各有优缺点）
 * @author wm
 */
public class FOSDemo {
    public static void main(String[] args) throws IOException {
        /**
         * 文件输出流的常用构造方法：
         * FileOutputStream(File file)
         * FileOutputStream(String path)
         * 以上两种构造方法创建的文件输出流为覆盖写
         * 模式，即：若指定的文件已经存在则会将该文
         * 文件数据清除，然后通过当前流写入的数据作
         * 为新数据保存
         *
         * FileOutputStream(File file,boolean  append)
         * FileOutputStream(String path,boolean append)
         * 以上两种构造方法创建的文件输出流为追加模式，
         * 即：若指定的文件存在，则源数据保留，通过当前流
         * 写入的内容会顺序追加到文件后面。
         */
        FileOutputStream fos=
                new FileOutputStream("./fos.txt");
        String line="www.bing.com";
        fos.write(line.getBytes("utf-8"));

        System.out.println("write ok");
        fos.close();

        FileOutputStream fos1 =
                new FileOutputStream("./fos.txt",true);
        fos1.write("append txt".getBytes("utf-8"));
        fos1.close();
    }
}
