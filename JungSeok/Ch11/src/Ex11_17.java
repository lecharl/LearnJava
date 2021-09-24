import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_17 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(100));
		map.put("���ڹ�", new Integer(90));
		map.put("���ڹ�", new Integer(90));
		
		System.out.println(map);
		
		//***cf_06 iterator�� �о����
		Set set = map.entrySet();
		//**������
		System.out.println(set);
		Iterator it = set.iterator();
		//�Ʒ��� ���� ������ ���� ��
		//Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			/******�̰� �� �𸣰ڴ�. ����entry�� �޾ƾ��ϴµ�
			* Map�������̽� ������ Entry�������̽�
			* �������̽��ȿ� ����� ����Ŭ������ �������̽��� ��� static�̶� �ٷ� ȣ�� ����
			* ������ list��set���� : Object obj = it.next();�̷��� �޾Ҵµ� �� ��ü�ϱ�
			* (Map.Entry)����ȯ�� �ʿ��ϴ�.
			*/
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : "+e.getKey()+", ���� : "+e.getValue());
		}
				
		
		//***key�鸸
		set = map.keySet();
		System.out.println("������ ��� : "+set);
		
		//***value�鸸(Collection)
		Collection c = map.values();
		System.out.println("���� ���� : "+c);
		
		it = c.iterator();
		//�Ʒ��� ���� ������ ���� ��
		//it = map.values().iterator();
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			//int i = (int)it.next(); �ص���. ����ڽ�
			total = +i;
		}
		
		System.out.println("���� : "+total);
		System.out.println("��� : "+(float)total/set.size());
		System.out.println("�ְ����� : "+Collections.max(c));
		System.out.println("�������� : "+Collections.min(c));
		//**���� max(), min()�� Comparable������ Ŭ������ü�� ���� �� �ִ�!
		

	}

}
