package sample03;

public class TryTest {

	public static void main(String[] args) {
		
		try {
			sub();
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		System.out.println("�� �۵��Ƴ�?");

	}
	
	public static void sub() {
		int[] array = new int[10];
		int i = array[10];
		System.out.println(i);
	}

}

/**
 * 1. ������ �� � ����?
 * Array.IndexOutOfBoundsException �߻��Ѵ�
 * 2. try-catch �� ���� ó��
 * 3. throws �� ���� ó��
 */