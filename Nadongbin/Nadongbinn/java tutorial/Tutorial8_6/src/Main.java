import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 입력받아 공백 (정)직각삼각형 만들기
		
		Scanner line = new Scanner(System.in);
		
		System.out.println("몇 줄을 입력할까요?");
		int N = line.nextInt();
		
		for(int i = 0; i < N; i++)
		{
			for(int j = N - 1; j > i; j--) //공백
			{
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) //별
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		line.close();

	}

}
