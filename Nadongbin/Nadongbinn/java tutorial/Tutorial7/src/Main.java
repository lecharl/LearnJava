import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int i = input.nextInt();
		System.out.println("입력된 정수는 " + i + " 입니다.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장을 입력하세요.");
		String s = sc.nextLine();
		System.out.println("입력된 문장은 " + s + " 입니다.");
		
		input.close();
		sc.close();
	}

}
