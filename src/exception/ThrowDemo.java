package exception;

/**
 * 异常的抛出
 * 通常遇到以下情况，我们会使用throw主动抛出异常
 * 1.满足语法要求，但是不满足业务逻辑要求
 * 2.确实出现了异常，但是该异常不应该在当前代码片段
 * 中被处理时可以对外抛出
 * @author wm
 */
public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        Person p =new Person();
        try {
            /**
             * 当调用一个含有throws声明异常抛出的方法时，编译器会要求我们必须
             * 添加处理异常的手段，方式有两种：
             * 1.使用try-catch捕获并处理异常
             * 2.在当前方法上继续使用throws声明异常抛出
             */
            p.setAge(1000);//语法满足，但是业务错误
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println(p.getAge());
        System.out.println("结束了");
    }
}
