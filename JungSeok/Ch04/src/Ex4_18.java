import java.util.Scanner;

public class Ex4_18 {

	public static void main(String[] args) {
		// continue, break, �޴� �����ϱ�
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("(1) ¥��");
			System.out.println("(2) «��");
			System.out.println("(3) ������");
			System.out.print("�޴��� �����ϼ���.(0 : ����) > ");
			String tmp = scan.nextLine();
			int menu = Integer.parseInt(tmp);
			//���ڿ��� �޾� ���ڷ�
			if(menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			else if(!(1<=menu && menu <= 3)){
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.");
				continue;
				//���� �ݺ������� -> �ٽ� (1),(2)...�޴������ϼ���
			}
			System.out.println(menu+"�� �޴��� �����ϼ̽��ϴ�.");
		}
		scan.close();

	}

}
