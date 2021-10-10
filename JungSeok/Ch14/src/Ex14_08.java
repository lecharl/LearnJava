import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_08 {

	public static void main(String[] args) {
		Optional<String> strOpt = Optional.of("abcde");
		Optional<Integer> intOpt = strOpt.map(String::length);
		//s->s.length()
		System.out.println("strOpt= "+strOpt.orElse("empty"));	//null�ƴϸ� get()�� ��
		System.out.println("intOpt= "+intOpt.get());
		
		int result1 = Optional.of("123")
				.filter(s->s.length()>0)	//***Optional���� filter(),map()�� �ִ�!!!
				.map(Integer::parseInt)
				.get();
		System.out.println("result1= "+result1);
		
		int result2 = Optional.of("")
				.filter(s->s.length()>0)
				.map((s)->Integer.parseInt(s))
				.orElse(-1);	//���̰� 0���ϸ�("") �̸� -1 ��ȯ
		System.out.println("result2= "+result2);
		
		Optional.of("456").map(Integer::parseInt)
				.ifPresent(x->System.out.printf("result3= %d%n",x));
		
		OptionalInt optInt1 = OptionalInt.of(0);	//0
		OptionalInt optInt2 = OptionalInt.empty();	//�� ��ü
		
		System.out.println("optInt1�� value= "+optInt1.getAsInt());
//		System.out.println(optInt2.getAsInt());	//NoSuchElementException
		System.out.println("optInt2�� value= "+optInt2.orElse(-999));
		
		System.out.println("optInt1.toString()= "+optInt1.toString());
		System.out.println("optInt2.toString()= "+optInt2);
		System.out.println("optInt1.equals(optInt2)? "+optInt1.equals(optInt2));

	}

}
