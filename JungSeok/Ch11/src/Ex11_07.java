import java.util.Arrays;
import java.util.Comparator;

public class Ex11_07 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr);
		//String�� Comparable����(compareTo()����)�� ���� ����+������ ����
		System.out.println("strArr = "+Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		//String�� Comparator����(compare()����)+��ҹ��� ���� ����
		System.out.println("strArr = "+Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending());
		//�̹��� ���� ���� ������ ���� ��ü�� ȣ���Ѵ�.+����
		System.out.println("strArr = "+Arrays.toString(strArr));
		
	}

}

//������ compare()�� ������ �����ϴ� �޼ҵ�� �������̵��ϱ�
//���� compare()�� ���� �ִ� Comparator�� �����ؾ� �Ѵ�.
class Descending implements Comparator{
	public int compare(Object o1, Object o2) {
		//Comparable�� o1, o2�� ����Ÿ��Ŭ���� �Ǵ� �������������̽����
		//�� ��������, String implements Comparable �̹Ƿ� true
		//�� Comparable?? : compareTo()�� ������
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
//			return c2.compareTo(c1);
		}
		return -1;	
		//�񱳴���� Comparable�� ������ Ŭ������ �ƴϸ� ���� �� ���⿡ 
		//����� String�� Comparator�� �������� �ʾҴ�!! Comparable��!!!
	}
	
	
}