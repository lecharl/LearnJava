import java.util.Scanner;

public class Ex4_04 {

	public static void main(String[] args) {
		//������ ����
		
		int score = 0;		//����
		char grade = 'F';	//����, ����� �ʱ�ȭ!!!!! ���� �ȵ�!!!
		//�߿�!! �ƿ� ó������ ������ �������� �ʱ�ȭ�ϸ� ������ ������ ��������!!
		
		System.out.println("������ �Է��ϼ���.");
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
		System.out.println("������ '"+grade+"'�Դϴ�.");
		
		scan.close();

	}

}
