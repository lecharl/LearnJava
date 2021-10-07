import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex14_02 {

	public static void main(String[] args) {
		//블로그로 공부
		Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
		consumer.accept("Hello World");	//Hello
		consumer.andThen(System.out::println).accept("Hello World");
		//Hello
		//Hello World
		
		Function<String, Integer> function = str -> str.length();
		System.out.println(function.apply("Hello World"));
		//11
		
		Predicate<String> predicate = (str) -> str.equals("Hello World");
		System.out.println(predicate.test("Hell"));			//false
		System.out.println(predicate.test("Hello"));		//false
		System.out.println(predicate.test("Hello World"));	//true

	}

}

