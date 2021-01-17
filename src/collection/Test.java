package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {
    int a=1;
    String s="hello";
    Point p=new Point(1,2);
        Collection c=new ArrayList();
        c.add(p);
        test(a,s,p,c);
        System.out.println("a:"+a); //1
        System.out.println("s:"+s); //hello
        System.out.println("p:"+p); //2,2
        System.out.println("c:"+c); //3,4


    }
    public static void test(int a,String s,Point p,Collection c){
        a++;
        s=s+"world";
        p.setX(a);
        p=new Point(3,4);
        c.clear();
        c.add(p);
        c=new ArrayList();
        p=new Point(5,6);
        c.add(p);
    }
//    17.13
    /**
    a=1
    s="hello"
    p=2,2
    c=3,4
     */
}
