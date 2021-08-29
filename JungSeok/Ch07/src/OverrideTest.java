class MyPoint3 {
	int x;
	int y;
	String getlocation() {
		return "x:"+x+", y:"+y;
	}
	MyPoint3(){}
	
	MyPoint3(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class My3D extends MyPoint3 {	// 상속받고
	int z;
	String getlocation() {		// 그 클래스의 메소드를 받아서 덮어쓴다.
		return "x:"+x+", y:"+y+", z:"+z;
	}
	// Object클래스의 toString()을 오버라이딩
	// public이 붙은 이유 : toString()메소드가 원래 public이 붙어있기 때문에
	// 선언부가 똑같아야 하므로
	public String toString() {
		return "x:"+x+", y:"+y+", z:"+z;
	}
	My3D(){}	//super();==MyPoint3(); 호출

	My3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}

public class OverrideTest {

	public static void main(String[] args) {
		My3D p = new My3D();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getlocation());
		
		// toString()을 오버라이딩
		My3D p2 = new My3D(3,5,7);
		System.out.println(p2.getlocation());
		System.out.println(p2.toString());
		System.out.println(p2);
		
	}

}
