class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	// �̹��� �ڽĿ� ���� ���� ����
	// ��� 2��***!!!
	// int x = 20;  --> �ϸ� this.x = 20 ����
	
	void method() {
		int x = 15;
		System.out.println("x = "+x);				// ���� ����� �� = 15
		System.out.println("this.x = "+this.x);		// iv
		System.out.println("super.x = "+super.x);	// ���� = 10
	}
}


public class Ex7_03 {

	public static void main(String[] args) {
		// 
		Child2 c = new Child2();
		c.method();

	}

}
