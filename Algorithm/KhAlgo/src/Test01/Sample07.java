package Test01;

import java.util.Scanner;

public class Sample07 {

	public static void main(String[] args) {
		/*
		 for문을 이용하고 3항연산자를 이용해서 아래와같은 코드를 완성하시오.
정수를 입력하세요
5
0 + 1 + 2 + 3 + 4 + 5 = 15​
		 */
		System.out.println("정수를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for(int i=0; i<=n; i++) {
			System.out.print(i);
			sum += i;
			if(i != n) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = "+sum);
		scan.close();
	}

}
