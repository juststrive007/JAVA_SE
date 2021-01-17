package collection;

/**
 * JDK5之后推出了一个新特性，增强for循环
 * 也称为新循环，使用它可以以更简短的代码完成
 * 遍历数组或集合
 * 新循环不取代传统的工作。
 * @author wm
 */
public class NewForDemo1 {
    public static void main(String[] args) {
        String[] array={"one","two","three","four"};
        for(int i=0;i<array.length;i++){
            String str=array[i];
            System.out.println(str);
        }
        /**
         * 新循环的语法是编译器认可的而不是虚拟机认可
         * 编译器在编译源码时若发现新循环遍历数组时，就会
         * 改为使用普通for循环遍历
         *
         */
        for(String str:array){
            System.out.println(str);
        }
    }
}
