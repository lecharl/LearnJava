import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		// 1�̻�~100���� �������ڸ� ������
		System.out.println("1~100 ������ ������ �����ÿ�.");
		int answer = (int) (Math.random()*100) + 1;
		System.out.println("Answer : "+answer);
		
		System.out.print("�Է��Ͻÿ�. : ");
		Scanner scan = new Scanner(System.in);
		int num;
		do {
			num = scan.nextInt();
			if (num>answer) {
				System.out.println("�� ���� ���� �õ��� ������.");
			} else if(num<answer){	//else if ��!! 
				System.out.println("�� ū ���� �õ��� ������.");
			}
		} while(num != answer);
//			num = scan.nextInt();  //while�� �ϸ� �ѹ� �� ��� �ϹǷ�
		scan.close();		
		System.out.println("�����Դϴ�.");

	}

}
