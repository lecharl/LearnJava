import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// �Է¹޾� (��)�����ﰢ�� �����
		
		Scanner line = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ұ��?");
		int N = line.nextInt();
		
		for(int i = N; i > 0; i--)
		{
			for(int j = 0; i + j <= N; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		line.close();
	}

}
