package date;

import java.util.Calendar;

/**
 * Calendar�ṩ�˷�����
 * int get(int field)
 * ��ȡָ��ʱ���������Ӧ��ֵ��
 * ʱ�������Calendar�Գ�������ʽ�ṩ��
 * @author wm
 */
public class CalendarDemo2 {
    public static void main(String[] args) {
        //����calendar
        Calendar calendar=Calendar.getInstance();

        //��ȡ��
        int year=calendar.get(Calendar.YEAR);
        //��ȡ�£��·��Ǵ�0��ʼ����
        int month=calendar.get(Calendar.MONTH);
        //��ȡ����
        /**
         * ��ȡ��
         * �͡��족��ص�ʱ�������
         * DATE�����е��죬�׳Ƶļ���
         * DAY_OF_MONTH:��DATEһ��
         * DAY_OF_WEEK�����е��죬�ܼ�
         * DAY_OF_YEAR�����е���
         */
        int day=calendar.get(Calendar.DATE);

        //��ȡʱ����
        int h=calendar.get(Calendar.HOUR_OF_DAY);
        int m=calendar.get(Calendar.MINUTE);
        int s=calendar.get(Calendar.SECOND);

        System.out.println(year+"-"+ month+"-"+ day);
        System.out.println(h+"-"+ m +"-"+s);

        //�����ǽ���ĵڼ��죿
        int days=calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("today is the "+days+" day of year ");

        //�������ܼ�?
        int day_week=calendar.get(Calendar.DAY_OF_WEEK)-1;
        String[]  week= {"��","һ","��","��","��","��","��"};
        System.out.println("��������"+week[day_week]);

        /**
         * ��ȡָ��ʱ���������������ֵ��
         * ���磬�����������
         *
         */

       int  day_month=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("this month have "+day_month+" days");
    }
}
