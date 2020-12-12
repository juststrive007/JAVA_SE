package file;

import java.io.File;

/**
 * java.io.File
 * File用来表示文件系统中的一个文件或目录
 * 使用File可以：
 * 1.访问其表示的文件或目录的属性（名称，大小等）
 * 2.操作文件或目录（创建、删除）
 * 3.访问目录子项
 *
 * 但是不能访问文件数据
 * @author wm
 */

public class FileDemo1 {
    public static void main(String[] args) {
        /**
         * 创建File时指定路径通常用相对路径
         * 绝对路径在不同平台不好用
         * 相对路径更灵活
         *
         * 相对路径中“.”表示当前目录，在eclipse中
         * 运行时，“."对应是当前程序所在的项目目录
         */
        File file=new File("demo.txt");


        //获取名字
        String name =file.getName();
        System.out.println(name);

        //获取大小
        Long size=file.length();
        System.out.println(size);


        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());

    }

}
