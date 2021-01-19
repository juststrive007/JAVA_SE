package collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 栈结构
 * 栈结构可以保存一组元素，但是存取元素必须遵循
 * 先进后出的原则：
 * 常用于前进后退的类型的功能
 *
 * @author wm
 */
public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack=new LinkedList<>();

        /**
         * 双端队列为栈提供了对应得方法：
         * push和pop
         * push方法等同offerFirst
         * pop方法等同于pollFirsh
         *
         */
         stack.push("one");
         stack.push("two");
         stack.push("three");
         stack.push("four");
         stack.push("five");

         System.out.println(stack);

         String str=stack.pop();
         System.out.println(stack);
         System.out.println(str);





    }
}
