package file;

import java.io.File;
import java.io.FileFilter;

/**
 * File提供了一个重载的listFiles
 * File[] listFiles(FileFilter filter)
 * 该方法可以获取File所表示的目录中符合
 * 过滤器要求的子项，不符合的忽略
 * @author wm
 */
public class ListFileDemo2 {
    public static void main(String[] args) {
        File dir=new File(".");
        if(dir.isDirectory()){
            /*
            文件过滤器适合使用匿名内部类形式创建


            该过滤器实现以"."开头的文件名
             */
            FileFilter filter=new FileFilter() {
                @Override
                public boolean accept(File pathname) {
//                    if(pathname.isDirectory()){
//                        return true;
//                    }
                    String filename=pathname.getName();
                    return filename.startsWith(".");
//                    return false;
                }
            };

            /**
             * 该listFiles方法会将该目录子类都
             * 顺序的经过给定的过滤器的accept方法
             * 并将返回值为true的子项保留并返回
             */
            File[] subs=dir.listFiles(filter);

            System.out.println(subs.length);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }

    }
}
