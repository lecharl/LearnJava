import java.util.Scanner;

public class Ex4_05 {

	public static void main(String[] args) {
		//��øif ����Ͽ� ������ �� ����ȭ�ϱ�
		
		int score = 0;
		char grade = 'C';	//�̰͵� ����������!
		char opt = '0';		//����� �̰͵�
		
		System.out.println("����� ������ �Է��ϼ���.");
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
		
		System.out.printf("����� ������ %d, ������ '%c%c'�Դϴ�.", score, grade, opt);
		scan.close();

	}
}