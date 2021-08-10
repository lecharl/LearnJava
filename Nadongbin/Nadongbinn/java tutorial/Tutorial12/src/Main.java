import java.util.Scanner;

public class Main {

	// 반복함수를 사용한 피보나치 수열
	public static int fibo(int k) {
		int a1 = 1;
		int a2 = 1;
		int result = -1;   // 아예 첨부터 -1로 잡으면 좋다.
		
		if (k == 1 || k == 2)
		{
			return 1;
		}
		else 
		{
			for(int i = 2; i < k; i++)   // 자리가 한칸씩 이동**
			{
				result = a1 + a2;
				a1 = a2;
				a2 = result;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("몇 번째 피보나치 수열?");
		int N = input.nextInt();
		
		if (N == -1)
		{
			System.out.println("값이 존재하지 않는다.");
		}
		else 
		{
			System.out.println("다음과 같다 : " + fibo(N));
		}
		
		input.close();

	}

}
