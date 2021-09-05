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
		//Car�� �� �ڼյ�, �� Car c, FireEngine f, FireEngine ff �� ����, �Ű������� ������!
		if(cc instanceof FireEngine) {	//cc�� Ÿ���� FE �Ǵ� FE�� �ڼ��̸� true
			FireEngine fe = (FireEngine) cc;	//�Ű������� ���� �ּҸ� �����׿� ����
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
		Change.doWork(f);	//����Ű�� ��ü�� FE�� �Ű������� ->true
		
		Car c = new FireEngine();
		Change.doWork(c);	//����Ű�� ��ü�� FE�� �Ű������� ->true
		
		Change.doWork(new FireEngine());	//Ÿ�� FE�� �Ű������� ->true
		
		//nope!
		Change.doWork(new Am());	//Ÿ��Am�� �Ű������� ->false
		Change.doWork(new Car());	//Ÿ��Car�� �Ű������� ->false
		
		Car cc = new Car();
		FireEngine ff = new FireEngine();
		
		boolean b = cc instanceof FireEngine;	//cc�� Ÿ���� Car->false
		System.out.println(b);
		
		//false���� ��Ӱ���&&�Ʒ��� ���� ����ȯ �����ϴ�!
		cc = (Car)ff;
//		ff = (FireEngine) cc;	�̰� �ȵ�!!! ClassCastException
		boolean o = cc instanceof FireEngine;	//cc�� Ÿ���� FE->true
		System.out.println(o);

	}

}
