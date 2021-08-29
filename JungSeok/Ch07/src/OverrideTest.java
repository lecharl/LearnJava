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

class My3D extends MyPoint3 {	// ��ӹް�
	int z;
	String getlocation() {		// �� Ŭ������ �޼ҵ带 �޾Ƽ� �����.
		return "x:"+x+", y:"+y+", z:"+z;
	}
	// ObjectŬ������ toString()�� �������̵�
	// public�� ���� ���� : toString()�޼ҵ尡 ���� public�� �پ��ֱ� ������
	// ����ΰ� �Ȱ��ƾ� �ϹǷ�
	public String toString() {
		return "x:"+x+", y:"+y+", z:"+z;
	}
	My3D(){}	//super();==MyPoint3(); ȣ��

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
		
		// toString()�� �������̵�
		My3D p2 = new My3D(3,5,7);
		System.out.println(p2.getlocation());
		System.out.println(p2.toString());
		System.out.println(p2);
		
	}

}
