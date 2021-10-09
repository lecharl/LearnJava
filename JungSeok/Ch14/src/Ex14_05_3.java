import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_05_3 {

	public static void main(String[] args) {
		// 람다식 스트림 만들기
		//iterate(T seed, UnaryOperator f) 단항연산자
		Stream<Integer> intStream = Stream.iterate(0, n -> n + 2);
		intStream.limit(5).forEach(System.out::println);

		//generate(Supplier s) 입력X 출력O
		Stream<Integer> oneStream = Stream.generate(() -> 1);
		oneStream.limit(5).forEach(System.out::println);
		
		IntStream intStream2 = IntStream.rangeClosed(1, 10);
		//1 2 3 4 5 6 7 8 9 10
		intStream2.skip(3).limit(5).forEach(System.out::print);
		
		System.out.println();
		
		intStream2 = IntStream.rangeClosed(1, 10);
		intStream2.filter(i->i%2==0).forEach(System.out::print);
		System.out.println();
		
		IntStream intStream3 = IntStream.of(1,2,2,6,3,4,5,5,3,6);
		intStream3.distinct().forEach(System.out::print);
		System.out.println();
		
		intStream2 = IntStream.rangeClosed(1, 10);
		intStream2.filter(i->i%2!=0 && i%3!=0).forEach(System.out::print);
		
		intStream2 = IntStream.rangeClosed(1, 10);
		intStream2.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::print);

	}

}
