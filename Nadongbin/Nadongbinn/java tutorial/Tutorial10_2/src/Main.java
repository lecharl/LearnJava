import java.util.Scanner;

public class Main {

	public static char function(String s) {
		return s.charAt(s.length() - 1);
	}
	
	public static void main(String[] args) {
		// ���ڿ����� ������ �ܾ� ��ȯ�ϱ�
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		
		String S1 = input.nextLine();
				
		System.out.println("�� ������ ������ ���ڴ� " + function(S1) + " �Դϴ�.");
		
		input.close();
	}

}