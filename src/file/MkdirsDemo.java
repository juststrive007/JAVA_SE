package file;

import java.io.File;

/**
 * �����༶Ŀ¼
 * @author wm
 */
public class MkdirsDemo {
    public static void main(String[] args) {
        /**
         * ����a/b/c/d/e/fĿ¼
         */

        File dir=new File("./a/b/c/d/e/f");
        if(!dir.exists()){
            /**
             * mkdirs �Ὣ���в����ڵĸ�Ŀ¼һͬ����
             * ��mkdir���ᣬ�����Ƽ�ʹ��mkdirs����Ŀ¼
             */
            dir.mkdirs();
            System.out.println("created");
        }else {
            System.out.println("exsit");
        }
    }
}
