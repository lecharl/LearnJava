import java.util.Optional;

public class Ex14_08_0 {

	public static void main(String[] args) {
//		int[] arr = null;	//NullPointerException ���� ����!!!
		int[] arr = new int[0];	//�̷��� �ʱ�ȭ �ϴ� �� ����!!
		System.out.println("arr.length= "+arr.length);
		
//		Optional<String> opt = null;	//���� ����!!!
		Optional<String> opt = Optional.empty();
//		Optional<String> opt = Optional.of("abc");	//�Ʒ� �� abc
		
//		System.out.println("opt= "+opt.get());	//null�̸� ���ܹ߻�. ���� ����!!!
		System.out.println("opt= "+opt.orElse("EMPTY"));
		System.out.println("opt= "+opt.orElseGet(()->"EmPtY"));
		System.out.println("opt= "+opt.orElseGet(()->new String()));
		System.out.println("opt= "+opt.orElseGet(String::new));
		
	}
}
