package file;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.File;

/**
 * 获取目录子项
 * @author wm
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前目录中的所有子项
        File dir=new File(".");
        /*
        判断是文件还是目录
         */
        if(dir.isDirectory()){
            File[] subs=dir.listFiles();
            System.out.println(subs.length);
            for(int i=0;i<subs.length;i++){
                System.out.println(subs[i].getName());
            }
        }

    }
}
