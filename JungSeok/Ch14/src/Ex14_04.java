import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex14_04 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<10; i++)
			list.add(i);
		
		//***list�� ��� ��Ҹ� ����ϴ� ���
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
		//list�� ��� �� 2 �Ǵ� 3�� ����� ��Ҹ� �����Ѵ�.
		list.removeIf(x -> x%2==0 || x%3==0);
//		list.forEach(i -> System.out.print(i+", "));
		System.out.println(list);
		
		//list�� �� ��ҿ� 10�� ���Ѵ�.
		list.replaceAll(i -> i*10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "10");
		map.put("2", "20");
		map.put("3", "30");
		map.put("4", "40");
		
		//***map�� ��� ��Ҹ� {k,v}, {k,v}, ... �� �������� ����Ѵ�.
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
