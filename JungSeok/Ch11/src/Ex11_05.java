import java.util.*;

public class Ex11_05 {

	public static void main(String[] args) {
		Collection c = new HashSet();
		//***���׿� Collectoin����(����������) �ϸ� ���׿� � �ڼ��̵� ����
		//�Ʒ��� �ڵ带 �ٲ� �ʿ����
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator();//****
		
		while(it.hasNext()) {//��� �ִ��� Ȯ��
			Object obj = it.next();
			System.out.println(obj);
		}//������ ����
		//iterator()�� 1ȸ���̶� �پ����� �ٽ� ���;� �Ѵ�.
		
		it = c.iterator();//****
		
		while(it.hasNext()) {//��� �ִ��� Ȯ��
			Object obj = it.next();
			System.out.println(obj);
		}//������ ����
		
//		final int SIZE = list.size();
//		for(int i=0; i<SIZE; i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}//�̷��� ������ �ϳ�, ���� �÷����� �ٲٸ� ������� ���Ѵ�.
		
		

	}

}
