class AA{
	int i=100;
	BB b = new BB();	//내부클래스BB 객체 생성
	
	class BB{
		void method() {
//			AA a = new AA();	
			//없어도 됨! 객체생성없이 외부클래스 멤버 접근 가능
			System.out.println(i);	//a.i -> i 
		}
	}
}


public class InnerTest {

	public static void main(String[] args) {
//		BB b = new BB();	//에러. 밖에서 내부클래스 직접접근 못함
//		b.method();
		AA a = new AA();
		a.b.method();

	}

}
