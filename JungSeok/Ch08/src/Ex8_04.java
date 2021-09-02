
public class Ex8_04 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(3/0);	//AE
			System.out.println(4);		//실행 안함
			
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {	//*****
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		} catch (Exception e) {	//AE 제외하고 모든 예외, 제일 마지막
			System.out.println("Exception");
		}
		System.out.println(6);

	}

}
