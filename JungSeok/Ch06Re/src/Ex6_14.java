class FCar2{
	String color;
	String gearType;
	
	FCar2(String color, String gearType){
//		super();
		this.color = color;
		this.gearType = gearType;
	}
//	FCar2(){	//1-2. �Ʒ������� �Ѵٸ� �� �ʿ���!!
////		super();
//	}
}


class Car2 extends FCar2{
	int door;
	
	Car2(){	//����Ʈ
		this("d_red", "", 4);			//������ ȣ��
	}
	
	Car2(String gearType){
		this("new_grey", gearType, 8);	//������ ȣ��
	}
	
	Car2(String color, String gearType, int door){
//		super();	//1-1. �ڵ��߰��Ǳ� ������ FCar2 �⺻������ ȣ���
//		this.color = color;		//1. FCar2 �⺻�����ڰ� ������ ������ �ϳ�! ���� ����� �ƴ�
//		this.gearType = gearType;
		super(color, gearType);	//2. ������ ������ ȣ������ �� ����
		this.door = door;
	}
	
}


public class Ex6_14 {

	public static void main(String[] args) {
		//�⺻������+this�����ڷ� ����Ʈ��
		Car2 c1 = new Car2();
		System.out.printf("Car2�� ����Ʈ : %s, %s, %d%n", c1.color, c1.gearType, c1.door);
		
		Car2 c2 = new Car2("manual");
		System.out.printf("Car2�� ���Ÿ�Ը� : %s, %s, %d%n", c2.color, c2.gearType, c2.door);
		
		Car2 c3 = new Car2("orange", "half", 2);
		System.out.printf("Car2�� ���� �� : %s, %s, %d%n", c3.color, c3.gearType, c3.door);

	}

}
