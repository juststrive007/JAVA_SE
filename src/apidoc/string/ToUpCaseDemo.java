package apidoc.string;

/**
 * String toUpperCase()
 * String toLowerCase()
 * ����ǰ�ַ����е�Ӣ�Ĳ���ת��Ϊȫ��д��ȫСд
 */
public class ToUpCaseDemo {
    public static void main(String[] args) {
        String str = "�Ұ�java";
        System.out.println(str);

        String upper=str.toUpperCase();
        System.out.println(upper);

        String lower=upper.toLowerCase();
        System.out.println(lower);
    }
}
