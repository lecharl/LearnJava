import java.util.Scanner;

public class Main {

	public static int fibo(int k) {
		if (k == 1 || k == 2)
		{
			return 1;
		}
		else
		{
			return fibo(k - 1) + fibo(k - 2);
		}
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
