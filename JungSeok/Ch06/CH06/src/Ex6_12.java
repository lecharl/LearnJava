class Car {
	String color;		// iv1, 2, 3
	String geartype;	// ���� �ߴ� ������� ��� �ٷ� ��������
	int door;			// �׷��� �⺻������ �ʿ� ����.
	
	Car() {}							//�⺻������
	Car(String c, String g, int d){		//������
		color = c;
		geartype = g;
		door = d;
	}
}

public class Ex6_12 {

	public static void main(String[] args) {
		// �⺻�����ڿ� ������ 2
		
		// ���� �ߴ� ���
		Car c1 = new Car();
		c1.color = "blue";
		c1.geartype = "auto";
		c1.door = 2;
		
		// ���� ��� ��
		Car c2 = new Car("red", "manual", 4);	
		// 1. �������� c2 ����
		// 2. new : ��ü ����
		// 3. Car~ : ������ ȣ�� -> ��ü �ʱ�ȭ
		// 4. = : ����(����)
		
		System.out.println("c1�� color : "+c1.color+", geartype : "+c1.geartype+", door : "+c1.door);
		System.out.println("c2�� color : "+c2.color+", geartype : "+c2.geartype+", door : "+c2.door);
	}

}
