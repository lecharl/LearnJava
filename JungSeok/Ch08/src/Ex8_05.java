
public class Ex8_05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(3/0);
			System.out.println(4);
			
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("���ܸ޼��� : "+ae.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(6);

	}

}
