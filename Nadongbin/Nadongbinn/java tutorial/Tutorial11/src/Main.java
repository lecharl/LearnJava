import java.util.Scanner;

public class Main {

	public static int factorial(int number) {
		
		if (number == 1)
		{
			return 1;
		}
		else
		{
			return number * factorial(number - 1);  // 5! = 5 * 4! �̿� **
		}
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int N = input.nextInt();
		
		System.out.println("�� ���� ���丮���� �� : " + factorial(N));
		input.close();
	}

}
