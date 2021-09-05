
public class Ex9_02 {

	public static void main(String[] args) {
		
		Person p1 = new Person(990101_1234567L);
		Person p2 = new Person(990101_1234577L);
		
		if(p1.equals(p2)) {
			System.out.println("p1�� id�� p2�� id�� �����ϴ�.");
		} else {
			System.out.println("p1�� id�� p2�� id�� �ٸ��ϴ�.");
		}

	}

}

class Person{
	long id;
	
	Person(long id){
		this.id = id;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
		}
		return false;
		
//		if(!(obj instanceof Person))	return false;
//		
//		Person p = (Person)obj;
//		return this.id == p.id;
	}
	
}
