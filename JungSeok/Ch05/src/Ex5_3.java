
public class Ex5_3 {

	public static void main(String[] args) {
		int[] score = {79, 88, 33, 91, 100, 55, 95};
		
		int max = score[0];	//�ʱ갪�� �迭�� ù��°������
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if(min > score[i]) {
				min = score[i];
			}
		}	//�̷��� �ѹ��� ó���ϴٴ�!!
		System.out.println("�ִ� = "+max);
		System.out.println("�ּڰ� = "+min);

	}

}
