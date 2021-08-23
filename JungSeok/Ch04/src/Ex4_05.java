import java.util.Scanner;

public class Ex4_05 {

	public static void main(String[] args) {
		//중첩if 사용하여 학점을 더 세분화하기
		
		int score = 0;
		char grade = 'C';	//이것도 마찬가지로!
		char opt = '0';		//어찌보면 이것도
		
		System.out.println("당신의 점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			}
			else if(score < 94) {
				opt = '-';			
			}
		} else if(score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			}
			else if(score < 84) {
				opt = '-';			
			}
		}
		
		System.out.printf("당신의 점수는 %d, 학점은 '%c%c'입니다.", score, grade, opt);
		scan.close();

	}
}