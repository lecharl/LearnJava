
public class Main {

	public static int max(int a, int b) {
		return (a > b)? a : b;
	}
	
	public static int Max(int a, int b, int c) {
		int result = max(a, b);     // ���� ��������!!
		return (result > c)? result : c;
		
		// �̷��� �� ���� �ִ�. 
		// result = max(result, c);
		// return = result;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("124, 5523, 343 ���� ���� ū ����? " + Max(124, 5523, 343));
	}

}
