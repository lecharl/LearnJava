import java.util.*;

public class Ex11_05 {

	public static void main(String[] args) {
		Collection c = new HashSet();
		//***좌항에 Collectoin으로(더높은조상) 하면 우항에 어떤 자손이든 가능
		//아래의 코드를 바꿀 필요없다
		c.add("1");
		c.add("2");
		c.add("3");
		c.add("4");
		c.add("5");
		
		Iterator it = c.iterator();//****
		
		while(it.hasNext()) {//요소 있는지 확인
			Object obj = it.next();
			System.out.println(obj);
		}//끝까지 읽음
		//iterator()는 1회용이라 다쓰고나면 다시 얻어와야 한다.
		
		it = c.iterator();//****
		
		while(it.hasNext()) {//요소 있는지 확인
			Object obj = it.next();
			System.out.println(obj);
		}//끝까지 읽음
		
//		final int SIZE = list.size();
//		for(int i=0; i<SIZE; i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}//이렇게 가능은 하나, 위에 컬렉션을 바꾸면 사용하지 못한다.
		
		

	}

}
