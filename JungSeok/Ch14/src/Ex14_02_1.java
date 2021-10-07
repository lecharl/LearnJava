import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_02_1 {

	public static void main(String[] args) {
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;	//1<=x<101
		Consumer<Integer> c = i -> System.out.print(i+", ");	//출력
		Predicate<Integer> p = i -> i%2==0;	//짝수인지 검사
		Function<Integer, Integer> f = i -> i/10*10;	//**일의 자리 없애기
		
		List<Integer> list = new ArrayList<>();
		makeRandomList(s, list);
		System.out.println(list);
		
		printEvenNum(p, c, list);
		
		List<Integer> list2 = eraseIll(f, list);
		System.out.println(list2);
		
	}
	
	//Supplier s를 받아(1~100 난수를 받아) list에 추가
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++)
			list.add(s.get());
	}
	
	//list를 받아 Predicate p로 짝수인지 검사하고, Consumer c로 출력
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {	//**list의 모든요소 하나하나를 Integer i에 넣어서 
			if(p.test(i))	//i가 짝수면 true, 홀수면 false
				c.accept(i);//짝수면 Consumer 람다식대로 출력
		}
		System.out.println("]");
	}
	
	//list와 같은 크기의 새 List를 만들어, Function f로 일의 자리 없애고 그 새 List에 저장
	static <T> List<T> eraseIll(Function<T, T> f, List<T> list) {
		List<T> newList = new ArrayList<T>(list.size());	//new ArrayList<T>(크기)
		for(T i : list)
			newList.add(f.apply(i));	//일의 자리를 없애서 새 newList에 저장
		return newList;	//그 newList 반환, [요소1, 요소2, ...]
		
	}
}
