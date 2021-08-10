
public class Main {

	public static void main(String[] args) {
		// 1~100인 정수 100개를 랜덤하게 뽑고 평균값 구하기
		
		int[] arr = new int[100];
		int sum = 0;
		for(int i = 0; i < 100; i++)
		{
			arr[i] = (int) (Math.random() * 100 + 1);
			sum += arr[i];
		}
		System.out.println("1~100인 정수 100개의 평균값은 : " + sum / 100);
	}

}
