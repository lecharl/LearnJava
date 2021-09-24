package sample03;

public class TryTest {

	public static void main(String[] args) {
		
		try {
			sub();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		System.out.println("잘 작동됐나?");

	}
	
	public static void sub() {
		int[] array = new int[10];
		int i = array[10];
		System.out.println(i);
	}

}

/**
 * 1. 컴파일 시 어떤 오류?
 * Array.IndexOutOfBoundsException 발생한다
 * 2. try-catch 로 예외 처리
 * 3. throws 로 예외 처리
 */