import java.util.Calendar;

public class Ex10_05 {

	public static void main(String[] args) {
		//�ֿܼ� �Է��� ���� 2���� �ƴϸ� �Ʒ��� ����ϰ� ��
		if(args.length != 2) {
			System.out.println("Usage : java Ex10_5 2020 10");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int start_day_of_week = 0;	//1���� ����
		int end_day = 0;	//���� ������ ��
		
		Calendar sDay = Calendar.getInstance();	//������
		Calendar eDay = Calendar.getInstance();	//����
		
		//sDay = 2020�� 10��(10���� �Է��Ѵٸ�->9) 1��
		sDay.set(year, month-1, 1);
		//eDay = 2020�� 11��(10���� �Է��Ѵٸ�->11��) 1��
		eDay.set(year, month, 1);
		
		//������ �� ���ϱ�
		eDay.add(Calendar.DATE, -1);
		end_day = eDay.get(Calendar.DATE);
		//2020�� 10�� 31��
		
		//1���� ���� ���ϱ�
		start_day_of_week = sDay.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("      "+args[0]+"�� "+args[1]+"��");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//***�ش� ���� 1���� ��� ���������� ���� ������ ����Ѵ�.
		for(int i=1; i<start_day_of_week; i++) {
			System.out.print("   ");
		}
		//***i�� ������30 �Ǵ� 31����, n�� �����ֱ�(7)
		for(int i=1, n=start_day_of_week; i<=end_day; i++, n++) {
			System.out.print((i<10)? "  "+i : " "+i);
			//***10���ʹ� ��ĭ�� ���̵� �����ϱ�!
			if(n%7==0) System.out.println();
		}

	}

}
