import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		//�Է¹��� �� �ڸ����� ��
		
		//'%10'-> ������ �ڸ��� ��´�.
		//��) 12345%10 -> 5
		int sum=0;
		System.out.print("������ �Է��ϼ���. (��: 12345) : ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		//12345, 1234, 123, 12, 1 �� �̾Ƴ���!!
		for(; num>0; num /= 10) {	//�����س��� �ʹ� ��ƴ�.
			System.out.println(num);
			sum += num%10;
		}
		System.out.println("�� �ڸ����� ����? : "+sum);
	}

}
