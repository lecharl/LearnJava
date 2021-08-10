
public class Main {

	public static void main(String[] args) {

		int a = 50;
		int b = 60;
		
		System.out.println("최댓값은 " + max(a, b) + "입니다." );
		
	}
		// 반환형 함수이름 매개변수
	static int max(int x, int y) {
		int result = (x > y) ? x : y;
		return result;
	}
}
