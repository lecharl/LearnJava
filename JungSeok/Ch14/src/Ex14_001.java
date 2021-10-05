import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex14_001 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
		Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
		
//		Collections.sort(list, new Comparator<T>() {
//			public int compare(String s1, String s2) {
//				if(s1 instanceof Comparable && s2 instanceof Comparable) {
//					Comparable c1 = (Comparable) s1;
//					Comparable c2 = (Comparable) s2;
//					return s2.compareTo(s1);	//역순
//				}
//				return -1;
//			}
//		});
		//이 방식은 자꾸 에러나서 못하겠다 ㅠㅠㅠ
		System.out.println("list = "+list);

	}

}
//기본적으로 이렇게 되어있다!!!!
//@FunctionalInterface
//interface Comparator<T>{
//	public abstract int compare(T o1, T o2);
//}