import java.util.Calendar;

public class Ex10_01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		//�̷� ������� Calendar ��ü�� �����Ѵ�!!!
		System.out.println("*��¥*");
		System.out.println("�� ���� �⵵ : "+today.get(Calendar.YEAR));
		System.out.println("�� ���� ��(0~11, 0=1��) : "+today.get(Calendar.MONTH));
		System.out.println("�� ���� �� : "+today.get(Calendar.DATE));
		
		System.out.println("�� ���� �� ° �� : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° �� : "+today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("�� ���� �� ��(DATE�� ����) : "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("�� ���� �� �� : "+today.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("����(1~7, 1=�Ͽ���) : "+today.get(Calendar.DAY_OF_WEEK));
		System.out.println("�� ���� �� ° ���� : "+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		System.out.println("*�ð�*");
		System.out.println("����/����(0:����, 1:����) : "+today.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11) : "+today.get(Calendar.HOUR));
		System.out.println("�ð�(0~24) : "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("��(0~59) : "+today.get(Calendar.MINUTE));
		System.out.println("��(0~59) : "+today.get(Calendar.SECOND));
		System.out.println("1000 ���� 1��(0~999) : "+today.get(Calendar.MILLISECOND));
		
		System.out.println("TimeZone(-12~+12) : "+today.get(Calendar.ZONE_OFFSET)/3600000);
		//**õ���� ���� �����̹Ƿ� 60*60*1000�� ������
		System.out.println("�� ���� ������ �� : "+today.getActualMaximum(Calendar.DATE));
		//**�� ���� ������ ���� ã�´�
		
		

	}

}
