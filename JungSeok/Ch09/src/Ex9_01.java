
public class Ex9_01 {

	public static void main(String[] args) {
		Value v1 = new Value(20);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {	//v1이 가리키는 equals()호출
			System.out.println("v1과 v2는 같습니다.");
		} else {
			System.out.println("v1과 v2는 다릅니다.");
		}

		System.out.println(v1.value);
		System.out.println(v2.value);
	}

}

class Value{
	int value;
	
	Value(int value){
		this.value = value;	//20
	}
	
	public boolean equals(Object obj) {	//Object및 그 자손들 다 들어올 수 있음
		if(!(obj instanceof Value)) {
			return false;
		}
		Value v = (Value)obj;	//obj를 Value로 형변환
		System.out.println(this.value+"!");
		System.out.println(v.value);
		return this.value == v.value;
	}
	
}
