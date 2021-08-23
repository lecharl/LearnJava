import java.util.Scanner;

public class Ex4_04 {

	public static void main(String[] args) {
		//점수와 학점
		
		int score = 0;		//점수
		char grade = 'F';	//학점, 띄어쓰기로 초기화!!!!! 공백 안됨!!!
		//중요!! 아예 처음부터 마지막 조건으로 초기화하면 마지막 조건은 생략가능!!
		
		System.out.println("점수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
//		} else {
//			grade = 'F';
		}
		System.out.println("학점은 '"+grade+"'입니다.");
		
		scan.close();

	}

}
