class Car2 {
	String color;	// iv <- 원래 this.color ...
	String geartype;
	int door;
	
	Car2(){
		this("yellow", "auto", 2);	// 세번째 거 생성자 호출
	}
	
	Car2(String color, int door){
		this(color, "semi", door);		// 마찬가지. 단 매개변수로 따로 받고
	}
	
	Car2(String color, String geartype, int door) {
		this.color = color;		// 참조변수 this
		this.geartype = geartype;	// **그런데 궁금하다!! 위 두개 없애도 잘 작동함.
		this.door = door;		// 기본생성자가 없는데 어떻게??
	}
}


public class Ex6_14 {

	public static void main(String[] args) {
		// ex6_12 this 버전
		
		// 생성자 this();활용
		Car2 c1 = new Car2();
		System.out.println("c1의 color : "+c1.color+", geartype : "+c1.geartype+", door : "+c1.door);
		
		Car2 c2 = new Car2("grey", 6);
		System.out.println("c2의 color : "+c2.color+", geartype : "+c2.geartype+", door : "+c2.door);
		
		// 참조변수this 활용
		Car2 c3 = new Car2("blue", "manual", 4);
		System.out.println("c3의 color : "+c3.color+", geartype : "+c3.geartype+", door : "+c3.door);
		
		

	}

}
