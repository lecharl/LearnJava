
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;	//10�� 6����
		int b = 2_000_000;	//10�� 6����*2
		
		long c = a * b;		//10�� 12����	> int�� ���� 10�� 9�����̹Ƿ�
		System.out.println(c);	//�����÷ο�!!
		
		long d = (long)a * b;
		//�� �� �ϳ��� ����ȯ�� ���ָ� �������� �˾Ƽ� ����ȯ �ǹǷ�
		System.out.println(d);
	}

}
