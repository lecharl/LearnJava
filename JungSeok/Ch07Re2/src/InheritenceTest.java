
class MyPoint{
	int x;
	int y;
}

class Circle extends MyPoint{//���
	int r;
}

class Circle2{//����
//	MyPoint p = new MyPoint();//1.�ٷ� �ʱ�ȭ �ϰų�
	MyPoint p;
	int r;
	
	//***2. �ٱ��� �ִ� Ŭ������ ������ �ȿ��� �ʱ�ȭ ���ְų�
	public Circle2() {
		p = new MyPoint();
	}
}

public class InheritenceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
		System.out.println("c.x= "+c.x);
		System.out.println("c.y= "+c.y);
		System.out.println("c.r= "+c.r);
		
		Circle2 c2 = new Circle2();
		c2.p.x = 4;
		c2.p.y = 5;
		c2.r = 6;
		System.out.println("c2.p.x= "+c2.p.x);
		System.out.println("c2.p.y= "+c2.p.y);
		System.out.println("c2.r= "+c2.r);
		

	}

}
