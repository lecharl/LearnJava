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
		//Car cc, FireEngine f, FireEngine ff 등 가능, 매개변수의 다형성!
		if(cc instanceof FireEngine) {
			FireEngine fe = (FireEngine) cc;
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
		Change.doWork(f);
		
		Car c = new FireEngine();
		Change.doWork(c);		
		
		Change.doWork(new FireEngine());
		
		//nope!
		Change.doWork(new Am());
		Change.doWork(new Car());
//		Car c = new Car();
//		FireEngine f = new FireEngine();
//		
//		boolean b = c instanceof FireEngine;
//		System.out.println(b);
//		
//		c = (FireEngine)f;
//		boolean o = c instanceof FireEngine;
//		System.out.println(o);

	}

}
