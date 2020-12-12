package file;

import java.io.File;

/**
 * 创建文件夹
 * @author wm
 */
public class MkdirDemo {
    public static void main(String[] args) {
        File dir=new File("./demo");
        if(!dir.exists()){
            dir.mkdir();
            System.out.println("目录已创建");
        }else{
            System.out.println("exsit!");
        }

    }
}
