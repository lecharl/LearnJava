
public class Ex8_02 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(3/0);
			System.out.println(2);	//예외발생하면 다음문장 넘어감
		} catch (ArithmeticException ae) {
			System.out.println(4);
		}
		System.out.println(5);

	}

}
