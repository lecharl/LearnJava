import java.util.Arrays;
import java.util.Comparator;

public class CompareIntegerTest {

	public static void main(String[] args) {
		Integer[] arr = {30, 50, 40, 10, 20};
		//Integer�� �� ������ Comparable, Comparator�� �޾ƾ� �ϴϱ�?	
		
		//�⺻ ����(��������)
		Arrays.sort(arr);
		System.out.println("arr = "+Arrays.toString(arr));
		
		//��������
		Arrays.sort(arr, new DescComp());
		System.out.println("arr = "+Arrays.toString(arr));

	}

}
//Comparable��, Integer�� �ǳ�! 
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