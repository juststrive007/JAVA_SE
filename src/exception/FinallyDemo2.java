package exception;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 异常处理机制在IO当中的应用
 * @author wm
 */
public class FinallyDemo2 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("fos.dat");
            fos.write(1);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fos!=null){
                    fos.close();
                }

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}