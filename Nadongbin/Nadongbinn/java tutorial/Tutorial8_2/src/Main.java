import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 입력받아 감소형태의 역직각삼각형 만들기
		
		Scanner line = new Scanner(System.in);
		
		System.out.println("몇 줄을 입력할까요?");
		int N = line.nextInt();
		
		for(int i = N; i > 0; i--)
		{
			for(int j = i; j > 0; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		line.close();
	}

}
