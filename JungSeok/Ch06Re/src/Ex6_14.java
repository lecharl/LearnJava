class FCar2{
	String color;
	String gearType;
	
	FCar2(String color, String gearType){
//		super();
		this.color = color;
		this.gearType = gearType;
	}
//	FCar2(){	//1-2. 아래방법대로 한다면 꼭 필요함!!
////		super();
//	}
}


class Car2 extends FCar2{
	int door;
	
	Car2(){	//디폴트
		this("d_red", "", 4);			//생성자 호출
	}
	
	Car2(String gearType){
		this("new_grey", gearType, 8);	//생성자 호출
	}
	
	Car2(String color, String gearType, int door){
//		super();	//1-1. 자동추가되기 때문에 FCar2 기본생성자 호출됨
//		this.color = color;		//1. FCar2 기본생성자가 있으면 가능은 하나! 좋은 방법은 아님
//		this.gearType = gearType;
		super(color, gearType);	//2. 조상의 생성자 호출방법이 더 좋음
		this.door = door;
	}
	
}


public class Ex6_14 {

	public static void main(String[] args) {
		//기본생성자+this생성자로 디폴트값
		Car2 c1 = new Car2();
		System.out.printf("Car2의 디폴트 : %s, %s, %d%n", c1.color, c1.gearType, c1.door);
		
		Car2 c2 = new Car2("manual");
		System.out.printf("Car2의 기어타입만 : %s, %s, %d%n", c2.color, c2.gearType, c2.door);
		
		Car2 c3 = new Car2("orange", "half", 2);
		System.out.printf("Car2의 세개 다 : %s, %s, %d%n", c3.color, c3.gearType, c3.door);

	}

}
