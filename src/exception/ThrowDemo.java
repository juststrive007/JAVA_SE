package exception;

/**
 * �쳣���׳�
 * ͨ������������������ǻ�ʹ��throw�����׳��쳣
 * 1.�����﷨Ҫ�󣬵��ǲ�����ҵ���߼�Ҫ��
 * 2.ȷʵ�������쳣�����Ǹ��쳣��Ӧ���ڵ�ǰ����Ƭ��
 * �б�����ʱ���Զ����׳�
 * @author wm
 */
public class ThrowDemo {
    public static void main(String[] args) {
        System.out.println("����ʼ��");
        Person p =new Person();
        try {
            /**
             * ������һ������throws�����쳣�׳��ķ���ʱ����������Ҫ�����Ǳ���
             * ��Ӵ����쳣���ֶΣ���ʽ�����֣�
             * 1.ʹ��try-catch���񲢴����쳣
             * 2.�ڵ�ǰ�����ϼ���ʹ��throws�����쳣�׳�
             */
            p.setAge(1000);//�﷨���㣬����ҵ�����
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println(p.getAge());
        System.out.println("������");
    }
}
