package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型 JDK之后推出的另一个特性
 * 泛型也称为参数化类型，是指我们在使用某个类时
 * 指定其定义的某个属性，方法的参数或返回值的类型
 * 这样可以提高灵活性
 * 泛型的原型是Object，实际上是让编译器将Object当做
 * 我们指定的类型看待，使得赋值时编译器会协助检查
 * 类型匹配以及获取值时自动做类型转换
 * 泛型在集合中应用最频繁，用来指定集合中元素的实际类型。
 * @author wm
 */
public class CollectionDemo6 {

    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();
        /**
         * boolean add(E e)
         * 指定泛型后，编译器会检查实际传入的值得类型是否
         * 与指定的泛型匹配，不匹配则编译不通过。
         */
        c.add("one");
        c.add("two");
        /**
         * 在新循环中定义接收元素值的变量时也可以直接使用
         * 元素的实际类型了，编译器会在编译期间做造型操作。
         */
        for(String str:c){
            System.out.println(str);
        }
        /**
         * 迭代器以支持泛型，与其遍历的集合泛型一致即可
         */
        Iterator<String> it=c.iterator();
        while(it.hasNext()){
            /**
             * 编译器编译后会在这里多出造型的代码：
             * String str=（String)it.next();
             */
            String str=it.next();
            System.out.println(str);
        }
    }

}
