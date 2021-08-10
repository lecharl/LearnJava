
public class Main {

	public static int max(int a, int b) {
		return (a > b)? a : b;
	}
	
	public static int Max(int a, int b, int c) {
		int result = max(a, b);     // 여길 주의하자!!
		return (result > c)? result : c;
		
		// 이렇게 할 수도 있다. 
		// result = max(result, c);
		// return = result;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("124, 5523, 343 중의 가장 큰 값은? " + Max(124, 5523, 343));
	}

}
