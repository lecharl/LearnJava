
public class Ex8_02 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(3/0);
			System.out.println(2);	//���ܹ߻��ϸ� �������� �Ѿ
		} catch (ArithmeticException ae) {
			System.out.println(4);
		}
		System.out.println(5);

	}

}
