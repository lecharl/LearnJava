class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){	//����Ʈ
		this("d_red", "", 4);
	}
	
	Car2(String gearType){
		this("new_grey", gearType, 8);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
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
		System.out.printf("Car2�� ���Ÿ�Ը� : %s, %s, %d%n", c3.color, c3.gearType, c3.door);

	}

}
