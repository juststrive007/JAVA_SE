package reflect;

/**
 * ʹ�õ�ǰ����Է���
 * @author wm
 */
public class Person {
    public void sayHello(){
        System.out.println("Person:Hello!");
    }
    public void sayHi(){
        System.out.println("Person:Hi!");
    }
    public void say(String name){
        System.out.println("person:��Һ�,����"+name);
    }
    public void say(String name,int age){
        System.out.println("person����Һã�����"+name+",����"+age);
    }
    private void hehe(){
        System.out.println("����˽�з���������");
    }
}
