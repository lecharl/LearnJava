import java.util.*;

public class Ex11_04 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;	//Queue�� �ִ� 5�������� �����ϵ���
	//****static ���� : iv�� �ƴ� cv���� static�޼ҵ尡 ����� �� �����ϱ�!!!

	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ֽ��ϴ�.");
		
		while(true) {
			System.out.print(">> ");
			try {
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();
				//�յڰ�������, ���� ������
				
				if("".equals(input)) continue;	//�ǹ����ΰ� ���� �ݺ�����
				//***�� ���ڿ��� ��ġ�� �ٲ�ٸ�?? input�� null�� ��� ������ ���⿡ ��������!!!
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				//???? �Ʒ� else�� ���ص� �� �� ������??	
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println("help : ������ �����ݴϴ�.");
					System.out.println("q �Ǵ� Q : ���α׷��� �����մϴ�.");
					System.out.println("history : �ֱٿ� �Է��� ��ɾ "+MAX_SIZE+"�� �����ݴϴ�.");
				} else if(input.equalsIgnoreCase("history")) {
					//�켱 �Է¹��� ��ɾ� history �����ϰ�
					save(input);
					
					//LL�� ������ �����ش�.
					LinkedList list = (LinkedList)q;
					//***q�δ� ���ϴϱ�(�������̽�!) -> ���ο� ������+q�� ����ȯ�ؼ� �ֱ�
					final int SIZE = list.size();
					//�̷��� �ϴ°� �� ���� �ڵ�!!
					for(int i=0; i<SIZE; i++) {
						System.out.println((i+1)+". "+list.get(i));
					}
				} else {	//history �Է¾��ϰ� �ٸ� ��ɾ� �Է��ϸ� �����ϰ� ���
					save(input);
					System.out.println(input);
				}
				
			} catch (Exception e) {
				System.out.println("�Է¿����Դϴ�.");
			}
			
			
		}//while(true) ��

	}//main ��
	
	public static void save(String input) {
		//input�� ������ �ƴϸ� queue�� ����
		if(!"".equals(input)) q.offer(input);
		
		//***queue�� �ִ�ũ�⸦ ������ ���� ó�� �Էµ� ���� ����
		if(q.size()>MAX_SIZE) q.poll();
		//size() - Collection�������̽��� ����
	}

}
