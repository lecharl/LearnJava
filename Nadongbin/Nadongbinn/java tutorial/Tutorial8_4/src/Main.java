import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// 입력받아 (정)직각삼각형 만들기
		
		Scanner line = new Scanner(System.in);
		
		System.out.println("몇 줄을 입력할까요?");
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
