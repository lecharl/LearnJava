import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 입력받아 정삼각형 만들기
		// 대각선의 길이가 N 일
		
		Scanner line = new Scanner(System.in);
		
		System.out.println("대각선의 길이는?");
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
