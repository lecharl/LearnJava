class Parent {
	int x = 10;		// <- super.x
}

class Child extends Parent {
	int x = 20;		// <- this.x
	// 주의!! 이름이 같다고 초기화가 되는 게 아니라 다른 변수임!!!
	// 멤버가 !!!****3개****!!
	void method() {	
		System.out.println("x = "+x);				// 가장 가까운 애
		System.out.println("this.x = "+this.x);		// iv
		System.out.println("super.x = "+super.x);	// 조상의 멤버
	}
	
}


public class Ex7_02 {

	public static void main(String[] args) {
		// 
		Child c = new Child();
		c.method();

	}

}
