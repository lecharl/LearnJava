
public class Main {

	public static void main(String[] args) {
		// 1~100�� ���� 100���� �����ϰ� �̰� ��հ� ���ϱ�
		
		int[] arr = new int[100];
		int sum = 0;
		for(int i = 0; i < 100; i++)
		{
			arr[i] = (int) (Math.random() * 100 + 1);
			sum += arr[i];
		}
		System.out.println("1~100�� ���� 100���� ��հ��� : " + sum / 100);
	}

}
