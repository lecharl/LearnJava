import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex14_04 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++)
			list.add(i);
		
		//***list의 모든 요소를 출력하는 방법
		//1.
		list.forEach(i -> System.out.print(i+", "));
		System.out.println();
		//2.
		System.out.println(list);
		//3.
		Iterator it = list.iterator();
		while(it.hasNext())
			System.out.print(it.next()+", ");
		
		System.out.println();
		//list의 요소 중 2 또는 3의 배수인 요소를 제거한다.
		list.removeIf(x -> x%2==0 || x%3==0);
//		list.forEach(i -> System.out.print(i+", "));
		System.out.println(list);
		
		//list의 각 요소에 10을 곱한다.
		list.replaceAll(i -> i*10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "10");
		map.put("2", "20");
		map.put("3", "30");
		map.put("4", "40");
		
		//***map의 모든 요소를 {k,v}, {k,v}, ... 의 형식으로 출력한다.
		//1.
		map.forEach((k,v) -> System.out.print("{"+k+","+v+"}, "));
		System.out.println();
		//2.
		System.out.println(map);
		//3.
		Iterator it2 = map.entrySet().iterator();
		while(it2.hasNext())
			System.out.print(it2.next()+", ");
		System.out.println();
	}

}
