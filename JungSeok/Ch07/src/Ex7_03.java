class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	// 이번엔 자식에 따로 변수 없음
	// 멤버 2개***!!!
	// int x = 20;  --> 하면 this.x = 20 나옴
	
	void method() {
		int x = 15;
		System.out.println("x = "+x);				// 제일 가까운 애 = 15
		System.out.println("this.x = "+this.x);		// iv
		System.out.println("super.x = "+super.x);	// 조상 = 10
	}
}


public class Ex7_03 {

	public static void main(String[] args) {
		// 
		Child2 c = new Child2();
		c.method();

	}

}
