package exception;

import java.io.IOException;

/**
 * finally常见面试问题
 * 1:请分别说明 final，finally ，finalize
 * 2:下面代码
 * @author wm
 */
public class FinallyDemo3 {
    public static void main(String[] args) {

        System.out.println(
                test("0")+","+test(null)+","+test("")
        );
        //正确输出为：3,3,3
    }

    public static int test(String str){
        try{
            return str.charAt(0)-'0';
        }catch (NullPointerException e){
            return 1;
        }catch (Exception e){
            return 2;
        }
        finally {
            return 3;
        }
    }
}
