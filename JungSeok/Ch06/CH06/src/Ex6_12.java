class Car {
	String color;		// iv1, 2, 3
	String geartype;	// 원래 했던 방식으로 요걸 바로 가져가기
	int door;			// 그래서 기본생성자 필요 없다.
	
	Car() {}							//기본생성자
	Car(String c, String g, int d){		//생성자
		color = c;
		geartype = g;
		door = d;
	}
}

public class Ex6_12 {

	public static void main(String[] args) {
		// 기본생성자와 생성자 2
		
		// 원래 했던 대로
		Car c1 = new Car();
		c1.color = "blue";
		c1.geartype = "auto";
		c1.door = 2;
		
		// 지금 배운 거
		Car c2 = new Car("red", "manual", 4);	
		// 1. 참조변수 c2 생성
		// 2. new : 객체 생성
		// 3. Car~ : 생성자 호출 -> 객체 초기화
		// 4. = : 대입(연결)
		
		System.out.println("c1의 color : "+c1.color+", geartype : "+c1.geartype+", door : "+c1.door);
		System.out.println("c2의 color : "+c2.color+", geartype : "+c2.geartype+", door : "+c2.door);
	}

}
