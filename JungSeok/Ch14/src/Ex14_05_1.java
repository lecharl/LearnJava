import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_05_1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		//1. 객체를 스트림으로
		Stream<Integer> intStream = list.stream();	//list를 Stream으로
		intStream.forEach(System.out::print);
//		intStream.forEach(System.out::print);	//에러:intStream closed
		//스트림은 일회용이고, forEach()는 최종연산이므로 닫힘!!
		//**다시 생성해야 한다!!!!
		intStream = list.stream();
		intStream.forEach(System.out::print);
		System.out.println();
		
		//2. 배열을 스트림으로
		//1)Stream.of(가변인자)
		Stream<String> strStream = Stream.of("a","b","c");
		strStream.forEach(System.out::print);
		System.out.println();
		//2)Stream.of(T t)
		Stream<String> strStream2 = Stream.of(new String[] {"a","b","c"});
		strStream2.forEach(System.out::print);
		System.out.println();
		//위는 아래 두줄을 줄인 것 
		String[] strArr = {"a","b","c"};
		Stream<String> strStream3 = Stream.of(strArr);
		strStream3.forEach(System.out::print);
		System.out.println();
		//3)Arrays.stream(T[])
		Stream<String> strStream4 = Arrays.stream(strArr);
		strStream4.forEach(System.out::print);
		System.out.println();
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream2 = Arrays.stream(intArr);
//		intStream2.forEach(System.out::print);
//		System.out.println(intStream2.count());
//		System.out.println(intStream2.sum());
		System.out.println("average="+intStream2.average());	//다 최종연산이라 재생성 필수!!
		//Stream<Integer>로 하고 싶으면
		Integer[] intArr2 = {1,2,3,4,5};
		Stream<Integer> intStream3 = Arrays.stream(intArr2);
//		intStream3.forEach(System.out::print);
		System.out.println("count="+intStream3.count());	//이것밖에 없음!!!
	}

}
