
public class Ex5_2 {

	public static void main(String[] args) {
		int sum = 0;		//총합
		float average = 0f;	//평균, 실수로, float은 f
		double average2 = 0;//요건 double, double은 d또는 생략
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합 = "+sum);
		
		average = (sum / (float)score.length);	//95.6f
		average2 = (sum / (double)score.length);//95.6d
		//형변환 주의!!!! 둘중 아무거나 float 붙여라!!
		System.out.println("평균 = "+average);
		System.out.println("평균 = "+average2);

	}

}
