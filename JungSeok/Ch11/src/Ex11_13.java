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
			setHash.add(new Integer(num));	//setHash.add(num)도 가능
		}
		System.out.println("=== 기본 HashSet ===");
		System.out.println(setHash);	//정렬X
		//정렬하려면 list에 저장하기!!
		
		System.out.println("=== 정렬 후 HashSet ===");
		List list = new LinkedList(setHash);
		Collections.sort(list);
		System.out.println(list);

		for(int i=0; setTree.size()<6; i++) {
			int num = (int)(Math.random()*45 +1);	//1<= x <46
			setTree.add(new Integer(num));	//setHash.add(num)도 가능
		}
		System.out.println("=== 이미 정렬된 TreeSet ===");
		System.out.println(setTree);	//정렬O	
		//정렬이 따로 해줄 필요가 없다!
		
		Set set = new TreeSet(new TestCom());	//비교기준을 넣어야함
		set.add(new TestCom());
		set.add(new TestCom());
		set.add("1z");
		set.add(new Integer(1));
		System.out.println(set);
		
		Set set2 = new TreeSet();	
		set2.add(new Test());
		set2.add(new Test());
//		set2.add("1z");	신기하게 이런것들은 안되나보다
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
