import java.util.Scanner;

public class Main {

	public static int factorial(int number) {
		
		if (number == 1)
		{
			return 1;
		}
		else
		{
			return number * factorial(number - 1);  // 5! = 5 * 4! 이용 **
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("수를 입력하세요.");
		int N = input.nextInt();
		
		System.out.println("위 수의 팩토리얼의 값 : " + factorial(N));
		input.close();
	}

}
