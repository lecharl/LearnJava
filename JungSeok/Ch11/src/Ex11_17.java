import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_17 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바", new Integer(90));
		map.put("김자바", new Integer(100));
		map.put("이자바", new Integer(100));
		map.put("강자바", new Integer(90));
		map.put("안자바", new Integer(90));
		
		System.out.println(map);
		
		//***cf_06 iterator로 읽어오기
		Set set = map.entrySet();
		//**쌍으로
		System.out.println(set);
		Iterator it = set.iterator();
		//아래는 위의 두줄을 줄인 것
		//Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			/******이거 잘 모르겠다. 묶음entry로 받아야하는데
			* Map인터페이스 내부의 Entry인터페이스
			* 인터페이스안에 선언된 내부클래스나 인터페이스는 모두 static이라 바로 호출 가능
			* 이전에 list와set에선 : Object obj = it.next();이렇게 받았는데 얜 객체니까
			* (Map.Entry)형변환이 필요하다.
			*/
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : "+e.getKey()+", 점수 : "+e.getValue());
		}
				
		
		//***key들만
		set = map.keySet();
		System.out.println("참가자 명단 : "+set);
		
		//***value들만(Collection)
		Collection c = map.values();
		System.out.println("점수 모음 : "+c);
		
		it = c.iterator();
		//아래는 위의 두줄을 줄인 것
		//it = map.values().iterator();
		int total = 0;
		while(it.hasNext()) {
			Integer i = (Integer) it.next();
			//int i = (int)it.next(); 해도됨. 오토박싱
			total = +i;
		}
		
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(float)total/set.size());
		System.out.println("최고점수 : "+Collections.max(c));
		System.out.println("최저점수 : "+Collections.min(c));
		//**위의 max(), min()은 Comparable구현한 클래스객체만 들어올 수 있다!
		

	}

}
