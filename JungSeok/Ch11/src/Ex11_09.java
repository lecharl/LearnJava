import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_09 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "4", "2", "3", "3", "2", "4", "4"};
		//중복허용하지 않기 때문에 각자 하나씩만! "1"과 1은 다르니 중복아님
		
		Set set = new HashSet();
		
		//HashSet에 objArr의 요소들을 저장
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		//HashSet에 저장된 객체들 출력
		System.out.println(set);	//이게 set.toString()과 같은건가??
		
		//Iterator 이용한 출력
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
