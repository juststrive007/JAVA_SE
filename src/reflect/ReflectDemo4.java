package reflect;

import java.lang.reflect.Method;

/**
 * 调用有参方法
 * @author wm
 *
 */
public class ReflectDemo4 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("reflect.Person");
            Object o = cls.newInstance();

            Method method = cls.getMethod("say", String.class);
            method.invoke(o, "juststrive");

            Method method1=cls.getMethod("say", String.class, int.class);
            method1.invoke(o,"wm",34);

            //调用私有方法
            Method method3=
                    cls.getDeclaredMethod("hehe");
            method3.setAccessible(true);
            method3.invoke(o);

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        }

}
