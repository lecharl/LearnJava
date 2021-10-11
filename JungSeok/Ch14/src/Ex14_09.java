import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_09 {

	public static void main(String[] args) {
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
			};
		
//		Stream<String> strStream = Stream.of(strArr);
//		strStream.forEach(System.out::println);
		Stream.of(strArr).forEach(System.out::println);
		System.out.println("---------");
		Stream.of(strArr).parallel().forEach(System.out::println);
		System.out.println("---------");
		Stream.of(strArr).parallel().forEachOrdered(System.out::println);
		System.out.println("---------");
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s->s.length()==0);
		//길이가==0 인 문자열이 하나라도 있으면 false
		System.out.println("noEmptyStr= "+noEmptyStr);
		
		//????????Optional이 스트림을 받..지 근데 아래처럼 Stream.of도 되네
		Optional<String> sWord1 = Stream.of(strArr).
				filter(s->s.charAt(0)=='s').findFirst();
		Optional<String> sWord2 = Stream.of(strArr).parallel().
				filter(s->s.charAt(0)=='s').findAny();
		System.out.println("sWord1= "+sWord1.get());
		System.out.println("sWord2= "+sWord2.get());	//sum 또는 stream 이 나옴
		
		//Stream<String> -> Stream<Integer>로 변환
		Stream<Integer> is = Stream.of(strArr).map(String::length);
		//성능 향상을 위해 ***기본형 스트림으로 변환한다.
		//Stream<String> -> IntStream으로 변환. ***mapToInt()
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

		//Math::max(),min() // Integer::sum(),max(),min()
		int count = intStream1.reduce(0, (a,b)->a+1);
		int sum1 = intStream2.reduce(0, (a,b)->a+b);
//		int sum2 = intStream2.reduce(0, Integer::sum);
		
//		OptionalInt max1 = intStream3.reduce((a,b)->a>=b? a:b);
		OptionalInt max2 = intStream3.reduce(Integer::max);
//		OptionalInt max3 = intStream3.reduce(Math::max);
		//OptionalInt max = IntStream.empty().reduce(Math::max);
//		int max_1 = intStream3.reduce(0, (a,b)->a>=b? a:b);
//		int max_2 = intStream3.reduce(0, Integer::max);
//		int max_3 = intStream3.reduce(0, Math::max);
		
		OptionalInt min = intStream4.reduce(Integer::min);
		
		System.out.println("count= "+count);
		System.out.println("sum1= "+sum1);
//		System.out.println("sum2= "+sum2);
//		System.out.println("max1= "+max1.getAsInt());
		System.out.println("max2= "+max2.orElse(0));
//		System.out.println("max3= "+max3.orElseGet(()->0));
//		//아래는 int기 때문에 따로 get()이 필요없다!!
//		System.out.println("max_1= "+max_1);
//		System.out.println("max_2= "+max_2);
//		System.out.println("max_3= "+max_3);
		System.out.println("min= "+min.getAsInt());
		

	}

}
