
public class Ex9_01 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Balue b1 = new Balue(10);
//		Value v2 = new Value(10);
		
		if(v1.equals(b1)) {	//v1�� ����Ű�� equals()ȣ��
			System.out.println("v1�� b1�� �����ϴ�.");
		} else {
			System.out.println("v1�� b1�� �ٸ��ϴ�.");
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
	
	public boolean equals(Object obj) {	//Object�� �� �ڼյ� �� ���� �� ����
		if(!(obj instanceof Balue)) {
			return false;
		}
//		Value v = (Value)obj;	//obj�� ����Ű�� ��ü�ּҸ� Value v�� ������ ����ֱ�
		Balue b = (Balue)obj;
		System.out.println(b.value);
		
		System.out.println(this.value+"!");
		System.out.println(((Balue)obj).value);
		
//		return this.value == v.value;
//		return this.value == b.value;
		return this.value == ((Balue)obj).value;
		
	}
	
}
