package integer;

/**
 * JDK1.5推出时，推出了一个新特性：自动拆装箱
 * 该特性允许我们在源代码中可以让基本类型与对应
 * 的包装类之间相互赋值使用而无需再添加额外的转换
 * 但是该特性是编译器认可的，实际上编译器在将源代码
 * 编译为class文件时会添加代码转换
 * @author wm
 */
public class IngegerDemo3 {
    public static void main(String[] args) {
        /**
         * 这里会触发编译期自动拆箱特性
         * 编译期会在编译期间将包装类转换为基本
         * 类型，
         * 下面的代码会被修改为：
         * int a = new Integer(1).intValue()
         */
        int a=new Integer(1);
        /**
         * 这里触发自动装箱特性，编译器会修改下面代码
         * 为
         * Integer i = Integer.valueOf(a);
         */
        Integer i = a;
    }
}
