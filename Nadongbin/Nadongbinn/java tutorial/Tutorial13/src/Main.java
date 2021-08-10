import java.util.Scanner;

public class Main {

	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("몇 개의 숫자를 입력하시겠습니까? : ");
		int N = input.nextInt();
		
		int[] arr = new int[N];   // **배열을 만들고 **
		for(int i = 0; i < N; i++)
		{
			System.out.print("자연수를 입력하십시오. : ");
			arr[i] = input.nextInt();  //  **각 배열에 들어갈 숫자 입력하기**
		}
		int result = -1;
		for(int i = 0; i < N; i++)
		{
			result = max(result, arr[i]);
		}
		
		System.out.print("가장 큰 수는 무엇입니까? : " + result);
		input.close();
	}

}
