import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		// continue, break, 메뉴 선택하기
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("(1) 짜장");
			System.out.println("(2) 짬뽕");
			System.out.println("(3) 탕수육");
			System.out.print("메뉴를 선택하세요.(0 : 종료) > ");
			String tmp = scan.nextLine();
			int menu = Integer.parseInt(tmp);
			//문자열을 받아 숫자로
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(!(1<=menu && menu <= 3)){
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				continue;
				//다음 반복문으로 -> 다시 (1),(2)...메뉴선택하세요
			}
			System.out.println(menu+"번 메뉴를 선택하셨습니다.");
		}
		scan.close();

	}

}
