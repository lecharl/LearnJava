import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// �Է¹޾� ���ﰢ�� �����
		// �밢���� ���̰� N ��
		
		Scanner line = new Scanner(System.in);
		
		System.out.println("�밢���� ���̴�?");
		int N = line.nextInt();
		
		for(int i=-N; i<=N; i++)
		{
			for(int j=-N; j<=N; j++)
			{
				if(i*j>=N*N)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(".");
				}
			}
			System.out.println();
		}
		line.close();
	}

}
