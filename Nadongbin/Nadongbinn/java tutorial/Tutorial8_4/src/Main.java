import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// �Է¹޾� (��)�����ﰢ�� �����
		
		Scanner line = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ұ��?");
		int N = line.nextInt();
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		line.close();

	}

}
