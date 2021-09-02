
public class Ex8_06 {

	public static void main(String[] args) {
		try {
			Exception e = new Exception();	//예외 객체 생성
			throw e;	//참조변수 던져서
//			throw new Exception();	//한줄로 줄이면
			
		} catch (Exception e) {	//얘가 참조변수 잡기
			System.out.println("예외 메세지 : "+e.getMessage());
			//참조변수의 기본값은 null
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상종료되었음.");

	}

}
