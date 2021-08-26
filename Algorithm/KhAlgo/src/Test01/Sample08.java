package Test01;

import java.util.Scanner;

public class Sample08 {

	public static void main(String[] args) {
		/*
		 * 3항연산자를 이용해서 작성하시오
짝수를 출력하는 내용과 같게 작성하시오.
3항연산자를 이용해서 작성하시오
for문을 이용해서 작성하시오

정수를입력하세요
5
0 + 2 + 4 = 6​
		 */
		System.out.println("정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i=0; i<=n; i++) {
			if(i%2==0) {
				System.out.print(i);				
				sum += i;
			} else if(i!=n) {
					System.out.print(" + ");
			}
		}
		System.out.println(" = "+sum);
		scan.close();



	}

}
