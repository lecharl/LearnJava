import java.util.ArrayList;
import java.util.*;

public class Ex11_01 {

	public static void main(String[] args) {
		//capacity=10인 ArrayList
		ArrayList list1 = new ArrayList(10);
		//원래 객체만 받는다!! 그런데 현재 java9부턴 deprecated
		list1.add(new Integer(5));
		list1.add(4);
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		//ArrayList(Collection c) 
		//subList는 읽기전용이라 활용하려면 새 객체로 받아줘야 한다!
		/*List sub = list1.subList(1, 4);
		ArrayList list2 = new ArrayList(sub);
		를 줄인 것이다.*/		//index 1~3
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		//**Collection은 인터페이스, Collections는 유틸 클래스!!!
		Collections.sort(list1);	//(오름차순)정렬
		Collections.sort(list2);	//**sort(List<T> list)
		print(list1, list2);
		
		//**컬렉션타입 list1이, 컬렉션타입 list2에 포함된 모든 객체들을 포함하는지
		System.out.println("list1.containsAll(list2) : "+list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A");	//index3에 "A"추가, 뒤는 밀려난다.
		print(list1, list2);
		
		//변경
		list2.set(3, "AA");
		print(list1, list2);
		
		//검색
		list1.add(0, "1");
		print(list1, list2);
		System.out.println("indexOf(String \"1\") = "+list1.indexOf("1"));
		System.out.println("indexOf(Integer 1) = "+list1.indexOf(1));
		//**원래는 : list1.indexOf(new Integer(1)); 이다!!!
		System.out.println("=====");
		
		//삭제
		list1.remove(new Integer(1));	//boolean remove(Object o)
		print(list1, list2);
		//**list1.remove(1) 오토박싱 1인 요소를 제거한다 가 안됨!!!
		list1.remove(1);		//Object remove(int index)
		//***index 1 이 해당된다.
		//따라서 위의 객체 방식으로 해야함!!
		print(list1, list2);
		
		//포함된 것 제외하고 삭제
		System.out.println("list1.retainAll(list2) : "+list1.retainAll(list2));
		print(list1, list2);
		
		//포함된 것 삭제
//		list2.removeAll(list1);
//		print(list1, list2);
		//위를 contains 와 반복문을 통해 삭제
		System.out.println("list2.size() : "+list2.size());
		for(int i=list2.size()-1; i>=0; i--) {
			//(6-1=)5~0 총 6번 실행
			if(list1.contains(list2.get(i)))	//[5]부터
				//***list1과 list2의 순서를 바꾸면 안된다!!
				//contains(Object o): 컬렉션이 아닌 객체를 받기에 get()을 통해 하나하나 비교해야 함
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
