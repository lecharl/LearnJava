import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		int[] lotto = new int[45];	//����, ������� ����
		
		for(int i=0; i<45; i++) {
			lotto[i] = i+1;
		}
		System.out.println(Arrays.toString(lotto));
		//�� ��ҿ� ���� 1~45 �ʱ�ȭ
		
		for(int i=0; i<6; i++) {
			int n = (int)(Math.random()*45);	//0�̻�45�̸�
			int tmp = lotto[i];
			lotto[i] = lotto[n];
			lotto[n] = tmp;
		}
		System.out.println(Arrays.toString(lotto));
		
		//���� ���6���� �����ϰ� ���� �װ͸� ����ϱ�
		System.out.println("��÷��ȣ�� ?");
		for(int i=0; i<6; i++) {
			System.out.printf("lotto[%d] = %d%n", i, lotto[i]);
		}
		

	}

}
