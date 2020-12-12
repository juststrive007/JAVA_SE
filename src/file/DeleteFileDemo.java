package file;

import java.io.File;

/**
 * 删除文件
 * @author wm
 */
public class DeleteFileDemo {
    public static void main(String[] args) {
        //将当前目录下的test.txt删除
        File file=new File("./test.txt");
        if(file.exists()) {
            file.delete();
        }
    }
}
