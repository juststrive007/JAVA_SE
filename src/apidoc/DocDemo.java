package apidoc;

/**
 * �ĵ�ע���ǹ��ܼ�ע�ͣ�ֻ���������ط�ʹ�ã�
 * �࣬����������
 * ������ʹ��������˵����ǰ��Ĺ��ܣ������ͼ��
 * @author wm
 * @version 1.0
 * @since JDK1.8
 * @see java.lang.String
 *
 *
 */
public class DocDemo {
    /**
     * sayHello�����е��ʺ���
     */
    public final static String INFO = "���";



    /**
     *
     * Ϊ������û�����ʺ���
     * @param name  ������û���
     * @return �����ʺ�����ַ���
     */
    public String sayHello(String name){
        return INFO+name;
    }
}
