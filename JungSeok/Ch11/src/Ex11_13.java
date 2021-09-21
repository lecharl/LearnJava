import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {

	public static void main(String[] args) {
		Set setHash = new HashSet();
		Set setTree = new TreeSet();
		
		for(int i=0; setHash.size()<6; i++) {
			int num = (int)(Math.random()*45 +1);	//1<= x <46
			setHash.add(new Integer(num));	//setHash.add(num)�� ����
		}
		System.out.println("=== �⺻ HashSet ===");
		System.out.println(setHash);	//����X
		//�����Ϸ��� list�� �����ϱ�!!
		
		System.out.println("=== ���� �� HashSet ===");
		List list = new LinkedList(setHash);
		Collections.sort(list);
		System.out.println(list);

		for(int i=0; setTree.size()<6; i++) {
			int num = (int)(Math.random()*45 +1);	//1<= x <46
			setTree.add(new Integer(num));	//setHash.add(num)�� ����
		}
		System.out.println("=== �̹� ���ĵ� TreeSet ===");
		System.out.println(setTree);	//����O	
		//������ ���� ���� �ʿ䰡 ����!
		
		Set set = new TreeSet(new TestCom());	//�񱳱����� �־����
		set.add(new TestCom());
		set.add(new TestCom());
		set.add("1z");
		set.add(new Integer(1));
		System.out.println(set);
		
		Set set2 = new TreeSet();	
		set2.add(new Test());
		set2.add(new Test());
//		set2.add("1z");	�ű��ϰ� �̷��͵��� �ȵǳ�����
//		set2.add(new Integer(1));
		System.out.println(set2);
	}

}

class Test implements Comparable{

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}


class TestCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
