import java.util.ArrayList;
import java.util.*;

public class Ex11_01 {

	public static void main(String[] args) {
		//capacity=10�� ArrayList
		ArrayList list1 = new ArrayList(10);
		//���� ��ü�� �޴´�!! �׷��� ���� java9���� deprecated
		list1.add(new Integer(5));
		list1.add(4);
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//ArrayList(Collection c) 
		//subList�� �б������̶� Ȱ���Ϸ��� �� ��ü�� �޾���� �Ѵ�!
		/*List sub = list1.subList(1, 4);
		ArrayList list2 = new ArrayList(sub);
		�� ���� ���̴�.*/		//index 1~3
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		//**Collection�� �������̽�, Collections�� ��ƿ Ŭ����!!!
		Collections.sort(list1);	//(��������)����
		Collections.sort(list2);	//**sort(List<T> list)
		print(list1, list2);
		
		//**�÷���Ÿ�� list1��, �÷���Ÿ�� list2�� ���Ե� ��� ��ü���� �����ϴ���
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");	//index3�� "A"�߰�, �ڴ� �з�����.
		print(list1, list2);
		
		//����
		list2.set(3, "AA");
		print(list1, list2);
		
		//�˻�
		list1.add(0, "1");
		print(list1, list2);
		System.out.println("indexOf(String \"1\") = "+list1.indexOf("1"));
		System.out.println("indexOf(Integer 1) = "+list1.indexOf(1));
		//**������ : list1.indexOf(new Integer(1)); �̴�!!!
		System.out.println("=====");
		
		//����
		list1.remove(new Integer(1));	//boolean remove(Object o)
		print(list1, list2);
		//**list1.remove(1) ����ڽ� 1�� ��Ҹ� �����Ѵ� �� �ȵ�!!!
		list1.remove(1);		//Object remove(int index)
		//***index 1 �� �ش�ȴ�.
		//���� ���� ��ü ������� �ؾ���!!
		print(list1, list2);
		
		//���Ե� �� �����ϰ� ����
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		print(list1, list2);
		
		//���Ե� �� ����
//		list2.removeAll(list1);
//		print(list1, list2);
		//���� contains �� �ݺ����� ���� ����
		System.out.println("list2.size() : "+list2.size());
		for(int i=list2.size()-1; i>=0; i--) {
			//(6-1=)5~0 �� 6�� ����
			if(list1.contains(list2.get(i)))	//[5]����
				//***list1�� list2�� ������ �ٲٸ� �ȵȴ�!!
				//contains(Object o): �÷����� �ƴ� ��ü�� �ޱ⿡ get()�� ���� �ϳ��ϳ� ���ؾ� ��
				list2.remove(i);
		}
		print(list1, list2);

	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		System.out.println("=====");
	}

}
