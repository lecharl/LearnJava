
public class Ex4_10 {

	public static void main(String[] args) {
		//�ݺ����� �̿��Ͽ� 1~5�� �� ���ϱ�

		int sum = 0;
		int i = 1;
		for(; i<=5; i++) {
			sum += i;
			System.out.printf("1���� %2d�� ���� : %2d%n", i, sum);
			//%2d�� ���ڸ��� ������
		}
		System.out.printf("�� 1���� %2d�� ���� : %2d%n", --i, sum);
		//i--�ϸ� �� �������� ����ǹǷ� 5�� �ƴ϶� 6�� ���´�.
	}

}
