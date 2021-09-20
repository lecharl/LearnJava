import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		//**set의 크기가 6보다 작은 동안
		for(int i=0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45 + 1);
			//1<= x < 46
//			set.add(num);	오토박싱!
			set.add(new Integer(num));
		}
		System.out.println(set);	//***정렬X

		//***정렬을 하기 위해선 1. set의 모든 요소를 list에 저장해야 한다.
		List list = new LinkedList(set);	//LinkedList(Collection c)
		//2. 그 후 list 정렬!
		Collections.sort(list);		//Collections.sort(List list)
		//***Arrays.sort(배열) --- Collections.sort(list)
		//3. list 출력 
		System.out.println(list);


	}

}
