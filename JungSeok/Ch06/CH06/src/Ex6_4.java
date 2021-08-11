
public class Ex6_4 {

	public static void main(String[] args) {
		// 메서드 호출 관련 예제
		
		MyMath mm = new MyMath();  // 객체 생성=인스턴스 생성
		long result1 = mm.add(5L, 3L);
		// 호출한 메소드의 결과값을 메인안에 있는 변수에 저장
		// 같은 클래스라면 메소드명(0,0)만 필요하겠지만
		// 다른 클래스이므로, 리모컨인 mm.이 필요하다.
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.max(5L, 3L);
		
		System.out.println("add(5L, 3L) = "+result1);
		System.out.println("subtract(5L, 3L) = "+result2);
		System.out.println("multiply(5L, 3L) = "+result3);
		System.out.println("divide(5L, 3L) = "+result4);
		System.out.println("max(5L, 3L) = "+result5);
	}

}

//MyMath 라는 클래스 설계도

class MyMath {
	
	long add(long a, long b) {
		long result = a + b;
		return result;
		// return a + b;  라고 한 줄로 정리할 수 있다!
	}
	
	long subtract(long a, long b) {
		return a - b;	
	}
	
	long multiply(long a, long b) {
		return a * b;
	}
	
	double divide(double a, double b) {
		return a / b;
	}
	
	long max(long a, long b) {
		return (a>b)? a : b;
	}
}
