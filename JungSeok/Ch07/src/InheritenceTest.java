class Point2 {	// extends Object 
	int x;
	int y;
}

class Circle {	// extends Object
	Point2 p = new Point2();	// Circle클래스 포함
	int r;
}

public class InheritenceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.p.x = 2;
		c.p.y = 4;
		c.r = 5;
		System.out.println("원의 좌표는 ("+c.p.x+", "+c.p.y+"), 반지름은 "+c.r+"이다.");
		
		// Object클래스 내의 메소드 toString()사용하기
		System.out.println("c.toString : "+c.toString());
		System.out.println("c : "+c);
		// c.toString 대신 c만 해도 된다!!
	}

}
