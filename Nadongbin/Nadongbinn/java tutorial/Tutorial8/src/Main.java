import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 입력받아 증가형태의 역직각삼각형 만들기
		
		Scanner line = new Scanner(System.in);
		
		System.out.println("몇 줄을 출력할까요?");
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
