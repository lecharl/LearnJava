import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex12_02R {

	public static void main(String[] args) {
		HashMap<String, Student2> map = new HashMap<>();	//생략가능
		map.put("자바왕", new Student2("2학년", 2, 2, 90, 100, 80));
		map.put("홍길동", new Student2("1학년", 1, 1, 80, 90, 100));
		//map
		System.out.println(map);
		
		//***public Value get(Object key)
		Student2 s = map.get("자바왕");	//*** 형변환 필요없다!!
		System.out.println(s);
		System.out.println("정보: "+s.name+","+s.ban+","+s.ko);
		Student2 s2 = map.get("홍길동");
		System.out.println(s2);
		System.out.println("정보: "+s2.name+","+s2.no+","+s2.math);
		
		System.out.println("===이전 방식+지네릭스===");
		//**이전에 했던 방식+지네릭스 첨가
		//이건 아마 value가 하나일 때 유용할 것 같은데 흠
		Set<Entry<String, Student2>> set = map.entrySet();
		System.out.println(set);
		Iterator<Entry<String, Student2>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Student2> e = (Map.Entry<String, Student2>)it.next();
			System.out.println("이름: "+e.getKey()+", 정보: "+e.getValue());
		}
		//**key들만
		Set<String> set2 = map.keySet();
		System.out.println("이름명단: "+set2);
		//value들만인데 음..
		Collection<Student2> c = map.values();
		System.out.println("정보: "+c);

	}

}

class Student2{
	String name = "";
	int ban;
	int no;
	int ko;
	int eng;
	int math;
	
	public Student2(String name, int ban, int no, int ko, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.ko = ko;
		this.eng = eng;
		this.math = math;
	}
}