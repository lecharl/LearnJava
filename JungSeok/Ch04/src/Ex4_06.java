import java.util.Scanner;

public class Ex4_06 {

	public static void main(String[] args) {
		// switch�� ����
		
		System.out.print("������ ���� �Է��ϼ���. : ");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("��");	//�̷��� �� �ٷ� �� ���� �ְ�
			break;
		case 6: case 7: case 8:			//�ѹ��� �� �ٷ� �� ���� �ְ�
			System.out.println("����");
			break;
		case 9: case 10: case 11:
			System.out.println("����");
			break;
		default:
			System.out.println("�ܿ�");
			break;
		}
		scanner.close();
	}

}
