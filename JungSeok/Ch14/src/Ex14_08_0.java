import java.util.Optional;

public class Ex14_08_0 {

	public static void main(String[] args) {
//		int[] arr = null;	//NullPointerException 하지 말자!!!
		int[] arr = new int[0];	//이렇게 초기화 하는 게 좋다!!
		System.out.println("arr.length= "+arr.length);
		
//		Optional<String> opt = null;	//하지 말자!!!
		Optional<String> opt = Optional.empty();
//		Optional<String> opt = Optional.of("abc");	//아래 다 abc
		
//		System.out.println("opt= "+opt.get());	//null이면 예외발생. 하지 말자!!!
		System.out.println("opt= "+opt.orElse("EMPTY"));
		System.out.println("opt= "+opt.orElseGet(()->"EmPtY"));
		System.out.println("opt= "+opt.orElseGet(()->new String()));
		System.out.println("opt= "+opt.orElseGet(String::new));
		
	}
}
