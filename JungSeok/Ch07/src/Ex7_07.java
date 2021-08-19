class Car {
	String color;	// 멤버 4개
	int door;
	
	void drive() {	// 운전하기
		System.out.println("drive, brrr...");
	}
	void stop() {	// 멈추기
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	// 멤버 4+1 = 5개
	void water() {	// 물뿌리기
		System.out.println("water~~~");
	}
}


public class Ex7_07 {

	public static void main(String[] args) {
		// 다형성
		// 그림1
//		void doWork(Car c) {
//			if (c instanceof FireEngine) {
//				FireEngine fe = (FireEngine)c;
//				// 가능하면 c를 FireEngine으로 형변환하라.
//				fe.water();
//			}
//		}
		
//		Car car = null;	// 참조변수car에 null로 초기화
		FireEngine fe = new FireEngine();	// 리모콘 5개
//		FireEngine fe2 = null;
		
		System.out.println(fe instanceof Object);
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof FireEngine);
		
		fe.water();
		// 그림2
		Car car = new Car();
//		FireEngine fe2 = new FireEngine();
//		Car car = (Car)fe;	// (Car)생략 가능	-> 리모콘 4개
//		car.water();	// car는 water()사용 불가능!!
//		FireEngine fe2 = (FireEngine)car;	// 생략 불가능	-> 리모콘 5개
//		fe2.water();
		
//		Car car = new Car();
//		FireEngine fe = (FireEngine)car;	
//		// -> 형변환 실행 에러 java.lang.ClassCastException
//		fe.water();   // 컴파일 ok
		
		System.out.println(car instanceof Object);
		System.out.println(car instanceof Car);
		System.out.println(car instanceof FireEngine);
		
		fe.water(); 		

		
		car = (Car)fe;
	
		System.out.println(car instanceof Object);
		System.out.println(car instanceof Car);
		System.out.println(car instanceof FireEngine);
		
		fe.water(); 	
	}

}
