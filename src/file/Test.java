package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 编写程序，获取当前项目目录下src/string 目录中
 * 所有名字以“S”开头的文件 并将这些文件的名字输出
 * 到控制台
 * @author wm
 */
public class Test {
    public static void main(String[] args) {
        File dir=new File("./src/string");

        //定义过滤器
        FileFilter filter=new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isFile()){
                    String filename=pathname.getName();
                    return filename.startsWith("S");
                }
                return false;
            }
        };

        //展示文件
        if(dir.isDirectory()){
            File[] subs=dir.listFiles(filter);
            System.out.println(subs.length);
            for(int i=0;i<subs.length;i++)
            {
                System.out.println(subs[i].getName());
            }

        }
    }
}
