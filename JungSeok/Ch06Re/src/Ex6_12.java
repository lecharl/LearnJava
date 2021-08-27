class Car {
	String color;
	String gearType;
	int door;
	
//	Car(){}	//오버로딩이 아닌 중복이기에 쓸 수 없다.
	
//	Car(){
//		color = "red2";
//		gearType = "auto2";
//		door = 22;
//	}
	
	Car(){
		this("red2", "auto2", 22);
	}
	
	Car(String c, String g, int d){	//매개변수 있는 생성자, 오버로딩!
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
		//기본생성자+참조변수
		System.out.println("기본생성자 방식 : "+c1.color+", "+c1.gearType+", "+c1.door);
		
		Car c2 = new Car();
		//기본생성자+참조변수
		System.out.println("기본생성자 방식2 : "+c2.color+", "+c2.gearType+", "+c2.door);
		
		Car c3 = new Car("white", "manual", 4 );
		//매개변수 있는 생성자
		System.out.println("매개변수 있는 생성자 방식 : "+c3.color+", "+c3.gearType+", "+c3.door);
	}
}
