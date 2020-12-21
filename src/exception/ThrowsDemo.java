package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * 子类重写超类含有throws声明异常抛出的方法时
 * 对throws的重写规则
 * @author wm
 *
 */
public class ThrowsDemo {
    public void dosome()
        throws IOException, AWTException{};
}

class Sub extends ThrowsDemo{
//    public void dosome()
//        throws IOException,AWTException{
//
//    }

    //允许不再抛出任何异常
//    public void dosome(){};


    //允许抛出部分异常
//    public void dosome()throws IOException{}

    //允许抛出超类方法抛出异常的子类异常
//    public void dosome()throws FileNotFoundException{}

    //不允许抛出额外的异常
//    public void dosome()throws SQLException{}
    //不允许抛出超类方法抛出异常的超类异常
//    public void dosome()throws Exception{}

}
