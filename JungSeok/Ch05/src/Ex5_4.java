import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		int[] nArr = {99, 20, 1, 9, 33, 100, 4, 6, 63, 10};
		//�ε��� 0~9, �� 10��
		System.out.println(Arrays.toString(nArr));
		
		for(int i=0; i<nArr.length; i++) {	//100�� �ݺ� or �迭���̸�ŭ �ݺ�
			int n = (int)(Math.random()*10);
			//0�̻�10�̸� �ε��� �� �ϳ� ����. n�� �ε����� ���� 
			int tmp = nArr[i];
			nArr[i] = nArr[n];	
			nArr[n] = tmp;
			System.out.println(Arrays.toString(nArr));
			//�迭[i]�� �迭[n]�� ���� �ٲٴµ�, �ű�� tmp ���!!			
		}
		

	}

}
