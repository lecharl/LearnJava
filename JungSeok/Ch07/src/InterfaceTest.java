class A{	//다른 클래스의 메소드 호출
	public void method(I b) {	//인터페이스 I 구현한 객체B, C만 들어갈 수 있음!!!
		b.method();
	}
}
//껍데기
interface I{
	void method();
}
//알맹이
class B implements I{
	public void method() {
		System.out.println("B메소드 호출");
	}
}

class C implements I{
	public void method() {
		System.out.println("C메소드 호출");
	}
}


public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new B());	//A가 B, C를 사용(A가 B, C에 의존)
		a.method(new C());
	}

}
