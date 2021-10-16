class MyPoint3{
	int x;
	int y;
	
	String getLocation() {
		return "x:"+x+", y:"+y;
	}
}

class MyPoint3D extends MyPoint3{
	int z;
	
	public MyPoint3D(int x, int y, int z) {
		super.x = x;
		super.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x:"+x+", y:"+y+", z:"+z;
	}
	
//	public String toString() {
//		return "x:"+x+", y:"+y+", z:"+z;
//	}
}



public class OverrideTest {

	public static void main(String[] args) {
		MyPoint3D d3 = new MyPoint3D(1, 2, 3);
//		d3.x = 1;
//		d3.y = 2;
//		d3.z = 3;
		System.out.println(d3.getLocation());
		System.out.println(d3);

	}

}
