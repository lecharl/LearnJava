import java.util.function.Function;
import java.util.function.Predicate;

public class Ex14_03 {

	public static void main(String[] args) {
		Function<String, Integer> f = (s) -> Integer.parseInt(s, 16);	//���ڿ� s�� 16���� Integer��
		Function<Integer, String> g = (i) -> Integer.toBinaryString(i);	//i�� 2���� ���ڿ���
		
		Function<String, String> h = f.andThen(g);
		Function<Integer, Integer> h2 = f.compose(g);	//== g.andThen(f)
		
		System.out.println(h.apply("FF"));	//"FF" -> 255 -> "11111111"
		System.out.println(h2.apply(2));	//2 -> "10" -> 16
		
		Function<String, String> f2 = x -> x;	//�׵� �Լ�
		System.out.println(f2.apply("AAA"));	//"AAA"�״�� ���
		
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		
		Predicate<Integer> notP = p.negate();	//i >=100
		Predicate<Integer> all = notP.and(q).or(r);	//100<= i && i <200 || i%2 == 0
		Predicate<Integer> all2 = notP.and(q.or(r));	//100<= i && (i <200 || i%2 == 0)
		
		System.out.println(all.test(2));	//f && t || t -> f || t -> t
		System.out.println(all2.test(2));	//f && (t || t) -> f && t -> f
		
		Predicate<String> p2 = Predicate.isEqual("abc");
		boolean result = p2.test("abc22");
		System.out.println(result);
		//***���ٷ� ���̸�!!
		boolean result2 = Predicate.isEqual("abc").test("abc22");
		System.out.println(result2);

	}

}
