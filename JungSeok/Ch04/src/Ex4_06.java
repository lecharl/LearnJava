import java.util.Scanner;

public class Ex4_06 {

	public static void main(String[] args) {
		// switch로 계절
		
		System.out.print("현재의 월을 입력하세요. : ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");	//이렇게 세 줄로 할 수도 있고
			break;
		case 6: case 7: case 8:			//한번에 한 줄로 할 수도 있고
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
		scanner.close();
	}

}
