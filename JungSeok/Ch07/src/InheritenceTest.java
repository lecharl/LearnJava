class Point2 {	// extends Object 
	int x;
	int y;
}

class Circle {	// extends Object
	Point2 p = new Point2();	// CircleŬ���� ����
	int r;
}

public class InheritenceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 2;
		c.p.y = 4;
		c.r = 5;
		System.out.println("���� ��ǥ�� ("+c.p.x+", "+c.p.y+"), �������� "+c.r+"�̴�.");
		
		// ObjectŬ���� ���� �޼ҵ� toString()����ϱ�
		System.out.println("c.toString : "+c.toString());
		System.out.println("c : "+c);
		// c.toString ��� c�� �ص� �ȴ�!!
	}

}
