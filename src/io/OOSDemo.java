package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectOutputStream
 * java.io.ObjectInputStream
 * 对象流是一对高级流，作用是可以将java对象与字节
 * 进行相互转换，便于我们读写java对象
 * @author wm
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=
                new FileOutputStream("./person.obj");
        ObjectOutputStream oos=
                new ObjectOutputStream(fos);
        String[] otherinfo={"1","2"};
        Person p=new Person("wang",23,"man",otherinfo);
        /**
         * void writeObject(Object obj)
         * 将给定的对象按照其结构转换为一组字节并写出
         * 写出的对象所属的类必须实现serializable接口
         * 否则写出时会抛出异常
         *
         * 一个对象转换为字节后会发现比实际该对象存储的数据要大，
         * 这是应为这组字节除了包含当前对象的数据外，还要记录该对象
         * 的结构信息以便将来还原。
         *
         * 专业术语：
         * 1.将一个对象经过对象流写出时，对象流会按照其结构将
         * 该对象转换为一组字节，这个过程称为
         * 对象序列化
         * 2.这组被序列化的字节在再经过文件流写入文件（写入磁盘）
         * 做长久保存的过程称为：
         * 数据持久化
         *
         */
        oos.writeObject(p);
        oos.flush();
        System.out.println("finished");
        oos.close();
    }
}
