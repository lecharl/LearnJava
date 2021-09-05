class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive: brr...");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water~~~");
	}
}

class Am extends Car{

}

class Change{
	static void doWork(Car cc) {
		//Car와 그 자손들, 즉 Car c, FireEngine f, FireEngine ff 등 가능, 매개변수의 다형성!
		if(cc instanceof FireEngine) {	//cc의 타입이 FE 또는 FE의 자손이면 true
			FireEngine fe = (FireEngine) cc;	//매개변수로 들어온 주소를 왼쪽항에 저장
			fe.water();
		} else {
			System.out.println("nope!");
		}
	}
}


public class Ex7_07 {

	public static void main(String[] args) {
		//water~~~
		FireEngine f = new FireEngine();
		Change.doWork(f);	//가리키는 객체인 FE가 매개변수로 ->true
		
		Car c = new FireEngine();
		Change.doWork(c);	//가리키는 객체인 FE가 매개변수로 ->true
		
		Change.doWork(new FireEngine());	//타입 FE가 매개변수로 ->true
		
		//nope!
		Change.doWork(new Am());	//타입Am가 매개변수로 ->false
		Change.doWork(new Car());	//타입Car가 매개변수로 ->false
		
		Car cc = new Car();
		FireEngine ff = new FireEngine();
		
		boolean b = cc instanceof FireEngine;	//cc의 타입이 Car->false
		System.out.println(b);
		
		//false여도 상속관계&&아래의 경우면 형변환 가능하다!
		cc = (Car)ff;
//		ff = (FireEngine) cc;	이건 안돼!!! ClassCastException
		boolean o = cc instanceof FireEngine;	//cc의 타입이 FE->true
		System.out.println(o);

	}

}
