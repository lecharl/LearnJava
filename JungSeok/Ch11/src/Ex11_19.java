import java.util.*;
import static java.util.Collections.*;

public class Ex11_19 {

	public static void main(String[] args) {
		List list = new ArrayList();
		System.out.println(list);
		
		//**위의 import static... .Collections.* 때문에 생략 가능
		addAll(list, 1,2,3,4,5);//가변인자
		System.out.println(list);
		
		rotate(list, 2);	//오른쪽으로(반시계??방향으로) 두칸 이동
		System.out.println(list);
		
		swap(list, 0, 2);	//교환
		System.out.println(list);
		
		shuffle(list);	//섞기
		System.out.println(list);

		sort(list, reverseOrder());	//역순 정렬
		//== reverse(list)
		System.out.println(list);
		
		reverse(list);	//역순 정렬
		System.out.println(list);
		
		sort(list);
		System.out.println(list);
		
		//위에서 정렬했으니 가능
		int idx = binarySearch(list, 3);	//3이 저장된 index=2
		System.out.println("index of 3 = "+idx);
		
		System.out.println("max = "+max(list));
		System.out.println("min = "+min(list));
		System.out.println("min = "+max(list, reverseOrder()));
		
		fill(list, 9);
		System.out.println("list = "+list);
		
		//list와 같은 크기의 새로운 list생성하고 2로 채운다.
		//nCopies(int n크기, 뭐로 채울지)
		//**단 결과는 변경불가
		List newList = nCopies(list.size(), 2);
		System.out.println("newList = "+newList);
		
		//공통요소가 없으면 true 반환
		System.out.println("disjoint()? = "+disjoint(list, newList));
		
		//o1에 o2를 복사해서 넣기
		copy(list, newList);
		System.out.println("list = "+list);
		System.out.println("newList = "+newList);
		
		//list에서 oldVal(2)를 newVal(1)로 바꾸기
		replaceAll(list, 2, 1);
		System.out.println("list = "+list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		System.out.println("list2 = "+list2);

	}

}
