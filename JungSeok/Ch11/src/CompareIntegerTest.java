import java.util.Arrays;
import java.util.Comparator;

public class CompareIntegerTest {

	public static void main(String[] args) {
		Integer[] arr = {30, 50, 40, 10, 20};
		//Integer을 한 이유는 Comparable, Comparator를 받아야 하니까?	
		
		//기본 정렬(오름차순)
		Arrays.sort(arr);
		System.out.println("arr = "+Arrays.toString(arr));
		
		//내림차순
		Arrays.sort(arr, new DescComp());
		System.out.println("arr = "+Arrays.toString(arr));

	}

}
//Comparable도, Integer도 되네! 
class DescComp implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Integer && o2 instanceof Integer) {
			Integer i1 = (Integer)o1;
			Integer i2 = (Integer)o2;
			return i1.compareTo(i2)*-1;
//			return i2.compareTo(i1);
		}
		return -1;
	}
}