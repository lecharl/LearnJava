
public class Ex5_7 {

	public static void main(String[] args) {
		//커맨드라인 입력하면 뭐든 "문자열"로 받아들인다! 문자열배열임!!
		//띄어쓰기로 구분함
		//커맨드라인 입력하면 위의 args가 참조변수가 된다.
		//String[] args 생성!
		System.out.println("매개변수의 개수 : "+args.length);
		//args의 길이는 매개변수가 몇 개나 들어와 있는지
		for(int i=0; i<args.length; i++) {
			System.out.printf("args[%d] = %s%n", i, args[i]);
		}
		

	}

}
