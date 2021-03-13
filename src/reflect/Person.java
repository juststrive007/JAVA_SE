package reflect;

/**
 * 使用当前类测试反射
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
        System.out.println("person:大家好,我是"+name);
    }
    public void say(String name,int age){
        System.out.println("person：大家好，我是"+name+",今年"+age);
    }
    private void hehe(){
        System.out.println("我是私有方法！！！");
    }
}
