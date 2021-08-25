import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		int[] nArr = {99, 20, 1, 9, 33, 100, 4, 6, 63, 10};
		//인덱스 0~9, 총 10개
		System.out.println(Arrays.toString(nArr));
		
		for(int i=0; i<nArr.length; i++) {	//100번 반복 or 배열길이만큼 반복
			int n = (int)(Math.random()*10);
			//0이상10미만 인덱스 중 하나 선택. n을 인덱스로 잡자 
			int tmp = nArr[i];
			nArr[i] = nArr[n];	
			nArr[n] = tmp;
			System.out.println(Arrays.toString(nArr));
			//배열[i]과 배열[n]의 값을 바꾸는데, 거기게 tmp 사용!!			
		}
		

	}

}
