class AA{
	int i=100;
	BB b = new BB();	//내부클래스BB 객체 생성
	
	class BB{
		void method() {
//			AA aa = new AA();	
			//없어도 됨! 객체생성없이 외부클래스 멤버 접근 가능
			System.out.println(i);	//aa.i -> i 
		}
	}
}


public class InnerTest {

	public static void main(String[] args) {
//		BB b = new BB();	//에러. 밖에서 내부클래스 직접접근 못함
//		b.method();
		AA aa = new AA();
		AA.BB bb = aa.new BB();	//1. 오 쩜 뉴!!
		bb.method();
		aa.b.method();	//2. 설계도 내 객체 생성

	}

}
