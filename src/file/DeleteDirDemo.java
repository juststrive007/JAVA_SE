package file;

import java.io.File;

/**
 * 删除目录
 * @author wm
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir=new File("./demo");
        if(dir.exists()){
            //目录是空目录，才会成功
            dir.delete();
            System.out.println("deleted");
        }else {
            System.out.println("not exist");
        }

    }
}
