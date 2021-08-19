class Car {
	String color;	// ��� 4��
	int door;
	
	void drive() {	// �����ϱ�
		System.out.println("drive, brrr...");
	}
	void stop() {	// ���߱�
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	// ��� 4+1 = 5��
	void water() {	// ���Ѹ���
		System.out.println("water~~~");
	}
}


public class Ex7_07 {

	public static void main(String[] args) {
		// ������
		// �׸�1
//		void doWork(Car c) {
//			if (c instanceof FireEngine) {
//				FireEngine fe = (FireEngine)c;
//				// �����ϸ� c�� FireEngine���� ����ȯ�϶�.
//				fe.water();
//			}
//		}
		
//		Car car = null;	// ��������car�� null�� �ʱ�ȭ
		FireEngine fe = new FireEngine();	// ������ 5��
//		FireEngine fe2 = null;
		
		System.out.println(fe instanceof Object);
		System.out.println(fe instanceof Car);
		System.out.println(fe instanceof FireEngine);
		
		fe.water();
		// �׸�2
		Car car = new Car();
//		FireEngine fe2 = new FireEngine();
//		Car car = (Car)fe;	// (Car)���� ����	-> ������ 4��
//		car.water();	// car�� water()��� �Ұ���!!
//		FireEngine fe2 = (FireEngine)car;	// ���� �Ұ���	-> ������ 5��
//		fe2.water();
		
//		Car car = new Car();
//		FireEngine fe = (FireEngine)car;	
//		// -> ����ȯ ���� ���� java.lang.ClassCastException
//		fe.water();   // ������ ok
		
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
