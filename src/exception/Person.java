package exception;

/**
 * ʹ�õ�ǰ������쳣���׳�
 * @author wm
 */
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws IllegalAgeException {
        if(age<0 || age>100)
        {
            //�׳��쳣
            /**
             * ������ʹ��throw�׳��쳣ʱ������RuntimeException֮���
             * �����쳣�������ڷ�����ʹ��throws
             */
            throw new IllegalAgeException("���䲻�Ϸ���");
        }
        this.age = age;
    }
}
