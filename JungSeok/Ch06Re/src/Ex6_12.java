class Car {
	String color;
	String gearType;
	int door;
	
//	Car(){}	//�����ε��� �ƴ� �ߺ��̱⿡ �� �� ����.
	
//	Car(){
//		color = "red2";
//		gearType = "auto2";
//		door = 22;
//	}
	
	Car(){
		this("red2", "auto2", 22);
	}
	
	Car(String c, String g, int d){	//�Ű����� �ִ� ������, �����ε�!
		color = c;
		gearType = g;
		door = d;		
	}
}

public class Ex6_12 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.color = "red";
		c1.gearType = "auto";
		c1.door = 2;
		//�⺻������+��������
		System.out.println("�⺻������ ��� : "+c1.color+", "+c1.gearType+", "+c1.door);
		
		Car c2 = new Car();
		//�⺻������+��������
		System.out.println("�⺻������ ���2 : "+c2.color+", "+c2.gearType+", "+c2.door);
		
		Car c3 = new Car("white", "manual", 4 );
		//�Ű����� �ִ� ������
		System.out.println("�Ű����� �ִ� ������ ��� : "+c3.color+", "+c3.gearType+", "+c3.door);
	}
}
