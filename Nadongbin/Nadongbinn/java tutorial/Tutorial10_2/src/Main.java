import java.util.Scanner;

public class Main {

	public static char function(String s) {
		return s.charAt(s.length() - 1);
	}
	
	public static void main(String[] args) {
		// 문자열에서 마지막 단어 반환하기
		
		Scanner input = new Scanner(System.in);
		System.out.println("문장을 입력하세요.");
		
		String S1 = input.nextLine();
				
		System.out.println("위 문장의 마지막 글자는 " + function(S1) + " 입니다.");
		
		input.close();
	}

}
