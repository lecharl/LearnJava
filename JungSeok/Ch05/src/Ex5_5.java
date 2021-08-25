import java.util.Arrays;

public class Ex5_5 {

	public static void main(String[] args) {
		int[] lotto = new int[45];	//선언, 저장공간 생성
		
		for(int i=0; i<45; i++) {
			lotto[i] = i+1;
		}
		System.out.println(Arrays.toString(lotto));
		//각 요소에 숫자 1~45 초기화
		
		for(int i=0; i<6; i++) {
			int n = (int)(Math.random()*45);	//0이상45미만
			int tmp = lotto[i];
			lotto[i] = lotto[n];
			lotto[n] = tmp;
		}
		System.out.println(Arrays.toString(lotto));
		
		//앞의 요소6개만 랜덤하게 섞고 그것만 출력하기
		System.out.println("당첨번호는 ?");
		for(int i=0; i<6; i++) {
			System.out.printf("lotto[%d] = %d%n", i, lotto[i]);
		}
		

	}

}
