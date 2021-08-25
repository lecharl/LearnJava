
public class Ex5_3 {

	public static void main(String[] args) {
		int[] score = {79, 88, 33, 91, 100, 55, 95};
		
		int max = score[0];	//초깃값은 배열의 첫번째값으로
		int min = score[0];
		
		for(int i=1; i<score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if(min > score[i]) {
				min = score[i];
			}
		}	//이렇게 한번에 처리하다니!!
		System.out.println("최댓값 = "+max);
		System.out.println("최솟값 = "+min);

	}

}
