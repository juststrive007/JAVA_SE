package file;

import java.io.File;

/**
 * 创建多级目录
 * @author wm
 */
public class MkdirsDemo {
    public static void main(String[] args) {
        /**
         * 创建a/b/c/d/e/f目录
         */

        File dir=new File("./a/b/c/d/e/f");
        if(!dir.exists()){
            /**
             * mkdirs 会将所有不存在的父目录一同创建
             * 而mkdir不会，后续推荐使用mkdirs创建目录
             */
            dir.mkdirs();
            System.out.println("created");
        }else {
            System.out.println("exsit");
        }
    }
}
