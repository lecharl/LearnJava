
public class Ex14_01 {

	public static void main(String[] args) {
		//1. 익명클래스로
		MyFunction f1 = new MyFunction() {
			@Override
			public void run() {
				System.out.println("f1.run!");
			}
		};
		f1.run();
		
		//2. 람다식으로
		MyFunction f2 = () -> System.out.println("f2.run!!");
		f2.run();
		
		//3. 함수형인페를 매개변수로 삼고, 람다식을 호출하는 메소드
		MyFunction f3 = () -> System.out.println("f3.run!!!");
		execute(f3);	//이 두줄을 줄이면
		execute(() -> System.out.println("f3.run!!!"));
		
		//4. 함수형인페가 반환타입, 람다식을 뱉어내는 메소드
		MyFunction f4 = getMyFunction();
		f4.run();
		//이렇게 바로도 된다!
		getMyFunction().run();
		

	}//main
	
	static void execute(MyFunction f) {
		f.run();	//람다식을 호출하는 메소드
	}
	
	static MyFunction getMyFunction() {
//		MyFunction f = () -> System.out.println("f4.run!!!!");
//		return f;
		return () -> System.out.println("f4.run!!!!");
	}

}

@FunctionalInterface
interface MyFunction{
	void run();
}
