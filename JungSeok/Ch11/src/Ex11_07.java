import java.util.Arrays;
import java.util.Comparator;

public class Ex11_07 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);
		//String의 Comparable구현(compareTo()구현)에 의한 정렬+사전순 정렬
		System.out.println("strArr = "+Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		//String의 Comparator구현(compare()구현)+대소문자 구별 안함
		System.out.println("strArr = "+Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending());
		//이번엔 직접 만든 기준을 담은 객체를 호출한다.+역순
		System.out.println("strArr = "+Arrays.toString(strArr));
		
	}

}

//기존의 compare()를 역순을 배출하는 메소드로 오버라이딩하기
//따라서 compare()를 갖고 있는 Comparator를 구현해야 한다.
class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		//Comparable이 o1, o2의 조상타입클래스 또는 구현된인터페이스라면
		//이 문제에선, String implements Comparable 이므로 true
		//왜 Comparable?? : compareTo()를 쓰려고
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
//			return c2.compareTo(c1);
		}
		return -1;	
		//비교대상이 Comparable을 구현한 클래스가 아니면 비교할 수 없기에 
		//참고로 String은 Comparator를 구현하지 않았다!! Comparable만!!!
	}
	
	
}