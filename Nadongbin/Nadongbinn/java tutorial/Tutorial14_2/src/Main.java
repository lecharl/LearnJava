
public class Main {

	public static void main(String[] args) {
		// 1~9�� ������ �����ϰ� �̾Ƽ� 2�����迭�� ����ϱ�
		
		int N = 20;
		int [][] arr = new int[N][N];
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				arr[i][j] = (int) (Math.random() * 10);
			}
		}
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}