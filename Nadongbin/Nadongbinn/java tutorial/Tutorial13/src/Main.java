import java.util.Scanner;

public class Main {

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("�� ���� ���ڸ� �Է��Ͻðڽ��ϱ�? : ");
		int N = input.nextInt();
		
		int[] arr = new int[N];   // **�迭�� ����� **
		for(int i = 0; i < N; i++)
		{
			System.out.print("�ڿ����� �Է��Ͻʽÿ�. : ");
			arr[i] = input.nextInt();  //  **�� �迭�� �� ���� �Է��ϱ�**
		}
		int result = -1;
		for(int i = 0; i < N; i++)
		{
			result = max(result, arr[i]);
		}
		
		System.out.print("���� ū ���� �����Դϱ�? : " + result);
		input.close();
	}

}
