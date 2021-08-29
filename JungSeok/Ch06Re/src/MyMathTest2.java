class MyMath2{
	//iv
	long a, b;
	
	//생성자 자동추가
	MyMath2(){
		super();	//생성자호출 자동추가
	}
	
	//ins메소드1
	long insAdd() {	
		return a+b;
	}
	
	//static메소드1
	static long staticAdd1(long a, long b) {
		return a+b;	//매개변수로 받은 지역변수lv
		//iv 사용안함!!
	}
}

public class MyMathTest2 {
	
	long a=77L, b=88L;
	
	//ins메소드2
	long insAdd() {	
		return a+b;
	}

	//static메소드2
	static long staticAdd1(long a, long b) {
		return a+b;	//매개변수
	}
	
	public static void main(String[] args) {
		//ins메소드 : 객체생성+참조변수.
		MyMath2 mm1 = new MyMath2();	//기본생성자
		mm1.a = 11L;
		mm1.b = 22L;
		System.out.println("다_인스턴스메소드1 : "+mm1.insAdd());
		
		//ins메소드 : 같은 클래스라도 객체생성+참조변수.
		MyMathTest2 mm2 = new MyMathTest2();
		mm2.insAdd();
		System.out.println("같_인스턴스메소드2 : "+mm2.insAdd());
		
		//static메소드 : 바로! 다른 클래스라면 +클래스명.
		System.out.println("다_static메소드1 : "+MyMath2.staticAdd1(33L, 44L));
		
		//static메소드 : 바로! 같은 클래스라면 메소드만 사용!!
		System.out.println("같_static메소드2 : "+staticAdd1(55L, 66L));
		

	}

}
