import java.util.Scanner;

public class ScanfTest {

	public static void main(String[] args) {
		// Scanner 
		// ��ü ����
		Scanner scan = new Scanner(System.in);
		// ��ü ���
		String s1 = scan.next();
		String s2 = scan.nextLine();
		int num1 = scan.nextInt();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(num1);
		
		String str = scan.next();
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		scan.close();
		

	}

}
