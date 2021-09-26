import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex12_02R {

	public static void main(String[] args) {
		HashMap<String, Student2> map = new HashMap<>();	//��������
		map.put("�ڹٿ�", new Student2("2�г�", 2, 2, 90, 100, 80));
		map.put("ȫ�浿", new Student2("1�г�", 1, 1, 80, 90, 100));
		//map
		System.out.println(map);
		
		//***public Value get(Object key)
		Student2 s = map.get("�ڹٿ�");	//*** ����ȯ �ʿ����!!
		System.out.println(s);
		System.out.println("����: "+s.name+","+s.ban+","+s.ko);
		Student2 s2 = map.get("ȫ�浿");
		System.out.println(s2);
		System.out.println("����: "+s2.name+","+s2.no+","+s2.math);
		
		System.out.println("===���� ���+���׸���===");
		//**������ �ߴ� ���+���׸��� ÷��
		//�̰� �Ƹ� value�� �ϳ��� �� ������ �� ������ ��
		Set<Entry<String, Student2>> set = map.entrySet();
		System.out.println(set);
		Iterator<Entry<String, Student2>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Student2> e = (Map.Entry<String, Student2>)it.next();
			System.out.println("�̸�: "+e.getKey()+", ����: "+e.getValue());
		}
		//**key�鸸
		Set<String> set2 = map.keySet();
		System.out.println("�̸����: "+set2);
		//value�鸸�ε� ��..
		Collection<Student2> c = map.values();
		System.out.println("����: "+c);

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