import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myID", "1234");
		map.put("asdf", "1111");
		System.out.println(map);
		map.put("asdf", "1234");
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է����ּ���.");
			System.out.print("id : ");
			String id = sc.nextLine().trim();	//String �յ� ��������
			System.out.print("password : ");
			String password = sc.nextLine().trim();
			
			//***key��ġ Ȯ�� : equals�� �ƴ� containsKey!!
			//boolean equals(Object o) �ʰ� o�� ������ �� �̹Ƿ� �ȵ�!!
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� id�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;	//***�ݺ��� ������ ���� �ٽ� ���� �ݺ�����
			}
			
			//*****key�� ��ȯ�ϰ� �� ������ �ش� key�� ¦��value��!!! 
			//�̷��� containsValue�ϸ� �ȵȴ�!!
			//***value��ġ Ȯ�� : key��ġ Ȯ�� �� -> equals
			if(!(map.get(id)).equals(password)) {
				System.out.println("password�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			} else {
				System.out.println("id�� password�� ��ġ�մϴ�.");
				System.out.println("�α��� ���� ... WELCOME!!");
				break;	//�ݺ��� ������
			}
		}

	}

}
