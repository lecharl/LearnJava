
public class Ex4_13 {

	public static void main(String[] args) {
		//100�� �ȳѰ�
		int i=0;
		int sum=0;
		
		while(sum<=100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
//			i++;
//			sum += i; //�̷��� �� ���� �ִ�!
		}
	}

}
