package Socket;

import java.util.Arrays;

/**
 * 从指定数组中删除指定元素
 * @author wm
 */
public class Demo {
    public static void main(String[] args) {
        int pw=123;
        int[] allOut={2,4,5,77,8970,23,6,123,99,98};
        System.out.println(Arrays.toString(allOut));
        /**
         * 删除一个匹配的元素
         * 方式一
         * 找到匹配元素，以后所有元素向前一位，缩容
         */
//        for(int i=0;i<allOut.length;i++){
//            //System.out.print(allOut[i]);
//            if(pw==allOut[i]){
//                //int[] head= Arrays.copyOf(allOut,i);
//                System.arraycopy(allOut,i+1,allOut,i,allOut.length-i-1);
//                allOut=Arrays.copyOf(allOut,allOut.length-1);
//                break;
//            }
//        }

        /**
         * 方式二
         * 找到匹配元素，将最后一位元素拷贝到当前位置，缩容
         */
        for(int i=0;i<allOut.length;i++){
            if(pw==allOut[i]){
              //  System.arraycopy(allOut,i,allOut,allOut.length-1,1);
                allOut[i]=allOut[allOut.length-1];
                allOut=Arrays.copyOf(allOut,allOut.length-1);
                break;
            }
        }

        System.out.println(Arrays.toString(allOut));
    }
}
