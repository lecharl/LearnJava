
public class Ex2_12 {

	public static void main(String[] args) {
		// 형변환 
		System.out.println("3".charAt(0));	//문자3
		//문자열 -> 문자
		
		System.out.println(Integer.parseInt("3") + 1);	//숫자4
		System.out.println(Double.parseDouble("3.14"));//숫자3.14
		//문자열 -> 숫자
		
		System.out.println(3 + '0');	//3+48
		System.out.println('3' + '0');	//51+48
		System.out.println((char)(3 + '0'));	//51을 문자로
		//숫자 -> 문자
		
		System.out.println('3' - '0');	//51-48	//숫자3
		//문자 -> 숫자
		
		System.out.println('3' + "3");		//문자열33
		System.out.println("3" + 3);		//문자열33
		System.out.println("3" + "3");		//문자열33
		//-> 문자열

	}

}
