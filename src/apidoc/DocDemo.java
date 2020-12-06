package apidoc;

/**
 * 文档注释是功能级注释，只能在三个地方使用：
 * 类，方法，常量
 * 在类上使用是用来说明当前类的功能，设计意图等
 * @author wm
 * @version 1.0
 * @since JDK1.8
 * @see java.lang.String
 *
 *
 */
public class DocDemo {
    /**
     * sayHello方法中的问候语
     */
    public final static String INFO = "你好";



    /**
     *
     * 为给点的用户添加问候语
     * @param name  给点的用户名
     * @return 带有问候语的字符串
     */
    public String sayHello(String name){
        return INFO+name;
    }
}
