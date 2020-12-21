package exception;

/**
 * 使用当前类测试异常的抛出
 * @author wm
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws IllegalAgeException {
        if(age<0 || age>100)
        {
            //抛出异常
            /**
             * 当我们使用throw抛出异常时，除了RuntimeException之外的
             * 其他异常都必须在方法上使用throws
             */
            throw new IllegalAgeException("年龄不合法！");
        }
        this.age = age;
    }
}
