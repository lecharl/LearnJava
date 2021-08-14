
public class MM2_new {

	public static void main(String[] args) {
		// MyMathTest2의 생성자 버전, JAVA_22
		// static
		System.out.println("static : "+MM2_new2.staticadd(10L, 1L));
		// 객체없이 바로 호출
		
		// 인스턴스
		MM2_new2 mm2 = new MM2_new2();	// 객체 생성
		mm2.a = 20L;	// 참조변수.iv
		mm2.b = 2L;
		System.out.println("instance : "+mm2.instancadd());
		// 참조변수.인스턴스메소드
		
		// 생성자
		MM2_new2 mm3 = new MM2_new2 (30L, 3L);
		System.out.println("lv+structor : "+(mm3.a+mm3.b));

	}

}

class MM2_new2 {
	long a, b;	// iv
	
	// static 메소드
	static long staticadd(long x, long y) {	// 매개변수포함 lv
		 return x+y;
	}
	
	// 인스턴스 메소드
	long instancadd(){
		return a+b;	// iv
	}
	
	// 매개변수가 있는 생성자 (메소드)
	MM2_new2 (){}
	MM2_new2(long x, long y) {	// 반환타입이 없다.
		a = x;	// iv
		b = y;

	}
}
