
public class Ex5_2 {

	public static void main(String[] args) {
		int sum = 0;		//����
		float average = 0f;	//���, �Ǽ���, float�� f
		double average2 = 0;//��� double, double�� d�Ǵ� ����
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("���� = "+sum);
		
		average = (sum / (float)score.length);	//95.6f
		average2 = (sum / (double)score.length);//95.6d
		//����ȯ ����!!!! ���� �ƹ��ų� float �ٿ���!!
		System.out.println("��� = "+average);
		System.out.println("��� = "+average2);

	}

}
