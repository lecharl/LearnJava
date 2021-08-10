import java.util.Scanner;

public class Main {

	public static int fibo(int k) {
		if (k == 1 || k == 2)
		{
			return 1;
		}
		else
		{
			return fibo(k - 1) + fibo(k - 2);
		}
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
