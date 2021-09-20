import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		//�ߺ�ó��(equals(), hashcode())�� ����ȵ�
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		//***���� ���� Ŭ������ equals(), hashcode()�������̵� �ȵ������� �ߺ�ó�� �ȵ�
		
		System.out.println(set);//�������̵��� toString

	}

}

class Person{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		//int hash(Object... value); �������ڷ� 0~n�� ����!!
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		//obj�� Person�� �ڼ��̳�
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
		
	}

	public String toString() {
		return name+":"+age;
	}
	
}
