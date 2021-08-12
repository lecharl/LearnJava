class MyMath2 {
	
	long a, b;  //인스턴스 메소드
	
	long instanceadd() {   //인스턴스 메소드
		return a+b;	
	}
	
	static long staticadd(long a, long b) {    //static 메소드, 지역변수lv
		return a+b;    //지역변수lv
	}
}


public class MyMathTest2 {

	public static void main(String[] args) {
		// static 공부하기
		// static은 요렇게
		System.out.println("static 메소드 : "+MyMath2.staticadd(20L, 10L));
		// 객체없이 바로 호출

		// 인스턴스는 요렇게
		MyMath2 mm = new MyMath2();    // 객체 생성 필수
		mm.a = 22L;    // 객체 생성 후 참조변수로 인스턴스 변수 불러옴
		mm.b = 11L;    // 참조변수.인스턴스변수
		System.out.println("인스턴스 메소드 : "+mm.instanceadd());
		// 참조변수.인스턴스메소드

	}

}
