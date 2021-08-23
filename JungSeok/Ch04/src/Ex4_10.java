
public class Ex4_10 {

	public static void main(String[] args) {
		//반복문을 이용하여 1~5의 합 구하기

		int sum = 0;
		int i = 1;
		for(; i<=5; i++) {
			sum += i;
			System.out.printf("1부터 %2d의 합은 : %2d%n", i, sum);
			//%2d는 두자리의 십진수
		}
		System.out.printf("총 1부터 %2d의 합은 : %2d%n", --i, sum);
		//i--하면 이 다음부터 수행되므로 5가 아니라 6이 나온다.
	}

}
