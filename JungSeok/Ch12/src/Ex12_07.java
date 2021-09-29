class Parent{
	void parentMethod() {}
}

class Child extends Parent{

	@Override
	@Deprecated
	void parentMethod() {}
//	void parentmethod() {}	//위에 애너테이션이 없으면 오류가 나지 않는다.
	
}

@FunctionalInterface	//함수형 인터페이스는 하나의 추상메소드만 가능!
interface Testable{
	void test();	//추상메소드
//	void check();	//추상메소드
}	//위에 애너테이션이 없으면 오류가 나지 않는다.


public class Ex12_07 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod();

	}

}
