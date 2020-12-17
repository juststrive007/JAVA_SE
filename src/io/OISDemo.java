package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 使用文件输入
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=
                new FileInputStream("./person.obj");
        ObjectInputStream ois=
                new ObjectInputStream(fis);
        Object p=ois.readObject();
        System.out.println(p.toString());
        ois.close();
    }
}
