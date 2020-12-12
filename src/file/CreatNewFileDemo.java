package file;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个新文件
 * @author wm
 */
public class CreatNewFileDemo {
    /**
     * 在当前目录下创建新文件test.txt
     */

    public static void main(String[] args) throws IOException {
        File file=new File("./test.txt");
        if(!file.exists()){
            file.createNewFile();
            System.out.println("file created");
        }else {
            System.out.println("file exist!");
        }


    }
}
