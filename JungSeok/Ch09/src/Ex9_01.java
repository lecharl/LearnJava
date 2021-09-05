
public class Ex9_01 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Balue b1 = new Balue(10);
//		Value v2 = new Value(10);
		
		if(v1.equals(b1)) {	//v1이 가리키는 equals()호출
			System.out.println("v1과 b1는 같습니다.");
		} else {
			System.out.println("v1과 b1는 다릅니다.");
		}

		System.out.println(v1.value);
		System.out.println(b1.value);
	}

}

class Balue{
	int value;

	Balue(int value){
		this.value = value;	//20
	}
}

class Value{
	int value;
	
	Value(int value){
		this.value = value;	//20
	}
	
	public boolean equals(Object obj) {	//Object및 그 자손들 다 들어올 수 있음
		if(!(obj instanceof Balue)) {
			return false;
		}
//		Value v = (Value)obj;	//obj가 가리키는 객체주소를 Value v를 생성해 집어넣기
		Balue b = (Balue)obj;
		System.out.println(b.value);
		
		System.out.println(this.value+"!");
		System.out.println(((Balue)obj).value);
		
//		return this.value == v.value;
//		return this.value == b.value;
		return this.value == ((Balue)obj).value;
		
	}
	
}
