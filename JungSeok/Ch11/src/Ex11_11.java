import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		//중복처리(equals(), hashcode())로 저장안됨
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		//***내가 만든 클래스가 equals(), hashcode()오버라이딩 안돼있으면 중복처리 안됨
		
		System.out.println(set);//오버라이딩한 toString

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
		//int hash(Object... value); 가변인자로 0~n개 가능!!
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		//obj가 Person의 자손이냐
		Person p = (Person)obj;
		return this.name.equals(p.name) && this.age == p.age;
		
	}

	public String toString() {
		return name+":"+age;
	}
	
}
