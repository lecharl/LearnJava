import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// �Է¹޾� ���������� �������ﰢ�� �����
		
		Scanner line = new Scanner(System.in);
		
		System.out.println("�� ���� ����ұ��?");
		int N = line.nextInt();		
		
		for(int i = 0; i < N; i++)
		{
			for(int j = i; j < N; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		line.close();
	}

}
