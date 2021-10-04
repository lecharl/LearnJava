
public class Ex14_00 {
	
	//메소드 -> 람다식으로 바꿔보자
	//1.
	public int max(int a, int b) {
		return a>b ? a:b;
	}
	//->
	(int a, int b) -> a>b ? a:b

}
