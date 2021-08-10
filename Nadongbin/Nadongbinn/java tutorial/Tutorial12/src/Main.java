import java.util.Scanner;

public class Main {

	// �ݺ��Լ��� ����� �Ǻ���ġ ����
	public static int fibo(int k) {
		int a1 = 1;
		int a2 = 1;
		int result = -1;   // �ƿ� ÷���� -1�� ������ ����.
		
		if (k == 1 || k == 2)
		{
			return 1;
		}
		else 
		{
			for(int i = 2; i < k; i++)   // �ڸ��� ��ĭ�� �̵�**
			{
				result = a1 + a2;
				a1 = a2;
				a2 = result;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�� ��° �Ǻ���ġ ����?");
		int N = input.nextInt();
		
		if (N == -1)
		{
			System.out.println("���� �������� �ʴ´�.");
		}
		else 
		{
			System.out.println("������ ���� : " + fibo(N));
		}
		
		input.close();

	}

}
