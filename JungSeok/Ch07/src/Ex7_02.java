class Parent {
	int x = 10;		// <- super.x
}

class Child extends Parent {
	int x = 20;		// <- this.x
	// ����!! �̸��� ���ٰ� �ʱ�ȭ�� �Ǵ� �� �ƴ϶� �ٸ� ������!!!
	// ����� !!!****3��****!!
	void method() {	
		System.out.println("x = "+x);				// ���� ����� ��
		System.out.println("this.x = "+this.x);		// iv
		System.out.println("super.x = "+super.x);	// ������ ���
	}
	
}


public class Ex7_02 {

	public static void main(String[] args) {
		// 
		Child c = new Child();
		c.method();

	}

}
