
public class Ex9_01 {

	public static void main(String[] args) {
		Value v1 = new Value(20);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {	//v1�� ����Ű�� equals()ȣ��
			System.out.println("v1�� v2�� �����ϴ�.");
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
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
	
	public boolean equals(Object obj) {	//Object�� �� �ڼյ� �� ���� �� ����
		if(!(obj instanceof Value)) {
			return false;
		}
		Value v = (Value)obj;	//obj�� Value�� ����ȯ
		System.out.println(this.value+"!");
		System.out.println(v.value);
		return this.value == v.value;
	}
	
}
