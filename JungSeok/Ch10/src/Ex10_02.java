import java.util.*;

class Ex10_02 {

	public static void main(String[] args) {
		
		final String[] Day_OF_Week= {"", "��", "��", "ȭ", "��", "��", "��", "��"};
		//������ 1���� �����ϱ⿡, 0�� ���ڿ���
		//������ ���ȭ�� ���� final
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		
		//toString �������̵�			
		public static String toString(Calendar date) {
			return date.get(Calendar.YEAR)+"�� ";
		}	
		//�� �ڲ� ������ ������ �𸣰ڴ� �ФФ�
		
		//2020�� 4�� 29��
		//3��� Calendar.APRIL �ص� ��!
		date1.set(2020, 3, 29);
		System.out.println("date1�� "+ toString(date1)+ Day_OF_Week[date1.get(Calendar.DAY_OF_WEEK)]+"�����̴�.");
		
		System.out.println("date2�� "+ toString(date2)+ Day_OF_Week[date2.get(Calendar.DAY_OF_WEEK)]+"�����̴�.");
		
		//�� ��¥ ���� ����
		long difference = Math.abs(date1.getTimeInMillis() - date2.getTimeInMillis()) / 1000;
		
		
		System.out.println("�׳�(date1)���� ����(date)2���� "+difference+"�ʰ� �������ϴ�.");
		System.out.println("��(day)�� ����ϸ�"+ difference/(60*60*24)+"���Դϴ�.");
		
		
	}
}
