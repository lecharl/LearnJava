import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_07 {

	public static void main(String[] args) {
		Stream<String[]> strArrStream = Stream.of(
				new String[] {"abc","def","jkl"},
				new String[] {"ABC","GHI","JKL"} );
		//map
//		Stream<Stream<String>> strStrmStream = strArrStream.map(Arrays::stream);
//		strStrmStream
////		.map(String::toLowerCase)
////		.distinct()
////		.sorted()	요소가 Stream<String>이기 때문에 못할..걸??
//		.forEach(System.out::println);
		
//		Stream<String> strStream = strArrStream.flatMap(Arrays::stream);
//		strStream.map(String::toLowerCase)
//		.distinct()
//		.sorted()
//		.forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
				"Believe or not It is true",
				"Do or do not There is no try"
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +")))
		//split()으로 쪼개서 스트림<string> lineStream의 요소로..
		//***split(정규식), + : 하나 이상의 공백
		.map(String::toLowerCase)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		

	}

}
